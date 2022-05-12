package com.example.demo.resources;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Flight;
import com.example.demo.repository.FlightRepository;

@RestController
@CrossOrigin("http://localhost:3000")
@RequestMapping("/flights")

public class FlightControllers {
		
		@Autowired
		private FlightRepository flightrepository;

		@PostMapping("/addFlight")
		public String saveFlight(@RequestBody Flight flightid) {
		flightrepository.save(flightid);
		return "Added flight with id :  " + flightid.getFlightid();
	    }
		
		@GetMapping("{flightid}")
		public Optional<Flight> getTrain(@PathVariable String flightid){
			return flightrepository.findById(flightid);
		}
			
		@DeleteMapping("/delete/{flightid}")
		public String deleteFlight (@PathVariable String flightid) {
			flightrepository.deleteById(flightid);
			return "flight deleted with id : "+flightid;
	    }
		@PutMapping("/update/{flightid}")
		public Flight updateFlight(@PathVariable("flightid") String flightid,@RequestBody Flight f ) {
			f.setFlightid(flightid);
			flightrepository.save(f);
			return f;
			
	}

}
