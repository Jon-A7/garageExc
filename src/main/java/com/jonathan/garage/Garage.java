package com.jonathan.garage;

import java.util.ArrayList;

import com.jonathan.vehicles.Vehicle;

public class Garage {

	ArrayList<Vehicle> vehicleList = new ArrayList<Vehicle>();
	
	public void addVehicle(Vehicle vehicle) {
		vehicleList.add(vehicle);
	}
	
	public void removeVehicles(Vehicle Car) {
		vehicleList.remove(Car);
	}
	
	public void clearGarage() {
		vehicleList.clear();
	}
	
	public void printAllVehicles() {
		for (Vehicle i : vehicleList) {
			System.out.println(i);
		}
	}
	
	
	public void calculateBill(Vehicle vehicle) {
		for(Vehicle i : vehicleList) {
			
		}
		
	}

}

