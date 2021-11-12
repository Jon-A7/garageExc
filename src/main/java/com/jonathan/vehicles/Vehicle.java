package com.jonathan.vehicles;

public class Vehicle{
	private int vehicleId;
	private double price;
	private long stock;
	private String fuelType;
	private String brand;
//	Constructors
	public Vehicle() {
		
	}
	public Vehicle(int vehicleId, double price, long stock, String fuelType, String brand) {
		this.vehicleId = vehicleId;
		this.price = price;
		this.stock = stock;
		this.fuelType = fuelType;
		this.brand = brand;
	}
	
	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public int getVehicleId() {
		return vehicleId;
	}

	public void setVehicleId(int vehicleId) {
		this.vehicleId = vehicleId;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public long getStock() {
		return stock;
	}

	public void setStock(long stock) {
		this.stock = stock;
	}

	public String getFuelType() {
		return fuelType;
	}

	public void setFuelType(String fuelType) {
		this.fuelType = fuelType;
	}
	@Override
	public String toString() {
		return "Vehicle [vehicleId=" + vehicleId + ", price=" + price + ", stock=" + stock + ", fuelType=" + fuelType
				+ ", brand=" + brand + "]";
	}

	

}
