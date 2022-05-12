package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.model.Flight;

import com.example.demo.repository.FlightRepository;

public class FlightServices {
	@Autowired
	private FlightRepository flightrepository;



	public Flight addFlight(Flight flight) {
	return flightrepository.save(flight);
	}



	public List<Flight> getContact() {
	List<Flight> flight = flightrepository.findAll();
	System.out.println("Getting data from DB : " + flight);
	return flight;
	}



	public Optional<Flight> getFlightbyId(String id) {
	return flightrepository.findById(id);
	}



	public void deleteFlight(Flight flight) {
	flightrepository.delete(flight);
	}

}
