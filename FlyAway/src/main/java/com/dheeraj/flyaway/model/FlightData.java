package com.dheeraj.flyaway.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class FlightData {
	@Id	
	@Column(length=6)
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	private int flightId;
	
	private String sourceCity;
    private String destinationCity;
    private String flightName;
    private Date flightDate;
    private Double price;
    private String time;
	public int getFlightId() {
		return flightId;
	}
	public void setFlightId(int flightId) {
		this.flightId = flightId;
	}
	public String getSourceCity() {
		return sourceCity;
	}
	public void setSourceCity(String sourceCity) {
		this.sourceCity = sourceCity;
	}
	public String getDestinationCity() {
		return destinationCity;
	}
	public void setDestinationCity(String destinationCity) {
		this.destinationCity = destinationCity;
	}
	public String getFlightName() {
		return flightName;
	}
	public void setFlightName(String flightName) {
		this.flightName = flightName;
	}
	public Date getFlightDate() {
		return flightDate;
	}
	public void setFlightDate(Date flightDate) {
		this.flightDate = flightDate;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	@Override
	public String toString() {
		return "FlightData [flightId=" + flightId + ", sourceCity=" + sourceCity + ", destinationCity="
				+ destinationCity + ", flightName=" + flightName + ", flightDate=" + flightDate + ", price=" + price
				+ ", time=" + time + "]";
	}
	

}
