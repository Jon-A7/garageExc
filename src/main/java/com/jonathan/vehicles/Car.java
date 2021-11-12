package com.jonathan.vehicles;

public class Car extends Vehicle {
	private int numberofSeats;
	private int numberofDoors;
	private char tier;
	
	public Car() {
		
	}
	
	public Car(int numberofSeats, int numberofDoors,char tier, int vehicleId, double price, long stock, String fuelType, String brand) {
		super(vehicleId, price, stock, fuelType, brand);
		this.numberofSeats = numberofSeats;
		this.numberofDoors = numberofDoors;
	}

	public int getNumberofSeats() {
		return numberofSeats;
	}

	public void setNumberofSeats(int numberofSeats) {
		this.numberofSeats = numberofSeats;
	}

	public int getNumberofDoors() {
		return numberofDoors;
	}

	public void setNumberofDoors(int numberofDoors) {
		this.numberofDoors = numberofDoors;
	}

	public char getTier() {
		return tier;
	}

	public void setTier(char tier) {
		this.tier = tier;
	}
	
	
	

	

}
