package com.example.demo.resources;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.demo.model.*;
import com.example.demo.repository.*;

@CrossOrigin("http://localhost:3000")
@RestController
@RequestMapping("/search")
public class UserController {
	
	@Autowired
	private FlightRepository flightRepository;

    @GetMapping("/findAllFlights")
    public List<Flight> getflights(){
	return flightRepository.findAll();
	
}
    @GetMapping("/findAllflights/{flightid}")
    public Optional<Flight> getflights(@PathVariable String flightid){
	return flightRepository.findById(flightid);
}
	
}