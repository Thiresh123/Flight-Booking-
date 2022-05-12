package com.example.demo.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;



@Document(collection ="Flight")
public class Flight {

	@Id
	private String flightid;
	private String flightName;
	private String source;
	private String destination;
	public Flight(String flightid, String flightName, String source, String destination) {
		super();
		this.flightid = flightid;
		this.flightName = flightName;
		this.source = source;
		this.destination = destination;
	}
	public String getFlightid() {
		return flightid;
	}
	public void setFlightid(String flightid) {
		this.flightid = flightid;
	}
	public String getFlightName() {
		return flightName;
	}
	public void setFlightName(String flightName) {
		this.flightName = flightName;
	}
	public String getSource() {
		return source;
	}
	public void setSource(String source) {
		this.source = source;
	}
	public String getDestination() {
		return destination;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}

}
