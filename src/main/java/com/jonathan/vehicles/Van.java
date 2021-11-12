package com.jonathan.vehicles;

public class Van extends Vehicle {

	private int horsepower;
	private double weight;
	private double height;
	
	public Van() {
		
	}
	
	public Van(int horsepower, double weight, double height, int vehicleId, double price, long stock, String fuelType, String brand) {
		super(vehicleId, price, stock, fuelType, brand);
		this.horsepower = horsepower;
		this.weight = weight;
		this.height = height;
	}

	public int getHorsepower() {
		return horsepower;
	}

	public void setHorsepower(int horsepower) {
		this.horsepower = horsepower;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}
	
	

}
