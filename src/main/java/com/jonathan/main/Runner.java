package com.jonathan.main;

import com.jonathan.garage.Garage;
import com.jonathan.vehicles.Car;
import com.jonathan.vehicles.Motorcycle;
import com.jonathan.vehicles.Van;

public class Runner {

	public static void main(String[] args) {
		
//		Car(int numberofSeats, int numberofDoors,int tier, int vehicleId, double price, long stock, String fuelType, String brand)
//		Van(int horsepower, double weight, double height, int vehicleId, double price, long stock, String fuelType, String brand)
//		Motorcycle(int year, int topSpeedmph,double fuelCapacity, int vehicleId, double price, long stock, String fuelType, String brand)
		
		Garage g1 = new Garage();
		Car car = new Car(5, 5,'B', 1, 30000D, 20L, "diesel", "bmw");
		Van van = new Van(50, 1990D, 3.05D, 2, 32000.40D, 6L, "diesel", "ford");
		Motorcycle bike = new Motorcycle(2004, 134, 19.5D, 3, 23000,  12L, "petrol", "ducati");
		
		g1.addVehicle(car);
		g1.addVehicle(bike);
		g1.addVehicle(van);
		
		
		
		
		
		
	}

}
