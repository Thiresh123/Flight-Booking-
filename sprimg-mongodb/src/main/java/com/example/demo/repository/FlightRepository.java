package com.example.demo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.demo.model.Flight;

public interface FlightRepository extends MongoRepository<Flight, String> {

}
