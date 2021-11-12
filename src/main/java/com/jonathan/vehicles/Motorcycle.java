package com.jonathan.vehicles;

public class Motorcycle extends Vehicle {
	private int year;
	private int topSpeedmph;
	private double fuelCapacity;

	public Motorcycle() {
		
	}
	
	public Motorcycle(int year, int topSpeedmph,double fuelCapacity, int vehicleId, double price, long stock, String fuelType, String brand) {
		super(vehicleId, price, stock, fuelType, brand);
		this.year = year;
		this.topSpeedmph = topSpeedmph;
		this.fuelCapacity = fuelCapacity;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public int getTopSpeedmph() {
		return topSpeedmph;
	}

	public void setTopSpeedmph(int topSpeedmph) {
		this.topSpeedmph = topSpeedmph;
	}

	public double getFuelCapacity() {
		return fuelCapacity;
	}

	public void setFuelCapacity(double fuelCapacity) {
		this.fuelCapacity = fuelCapacity;
	}
	
	
}
