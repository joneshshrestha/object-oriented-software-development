package com.joneshshrestha.rentalapp;

public class Vehicle {
    private int vehicleId;
    private String make;
    private String model;
    private int year;
    private double mileage;
    private VehicleType type;
    private boolean available;
    private double dailyRate;

    // Constructor of the Vehicle class that initializes Vehicle attributes
    public Vehicle(int vehicleId, String make, String model, int year, double mileage, VehicleType type, double dailyRate) {
        this.vehicleId = vehicleId;
        this.make = make;
        this.model = model;
        this.year = year;
        this.mileage = mileage;
        this.type = type;
        // Initializes available to true as default
        this.available = true;
        this.dailyRate = dailyRate;
    }

    // Getter methods for retrieving vehicle attributes and a setter for availability
    public int getVehicleId() { return vehicleId; }
    public String getMake() { return make; }
    public String getModel() { return model; }
    public int getYear() { return year; }
    public double getMileage() { return mileage; }
    public VehicleType getType() { return type; }
    public boolean getAvailable() { return available; }
    public double getDailyRate() { return dailyRate; }
    public void setAvailable(boolean available) { this.available = available; }
}

