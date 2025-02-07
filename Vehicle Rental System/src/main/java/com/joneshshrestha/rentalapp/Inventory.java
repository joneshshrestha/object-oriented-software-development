package com.joneshshrestha.rentalapp;
import java.util.ArrayList;
import java.util.List;

public class Inventory {
    private int inventoryId;
    private VehicleType type;
    private List<Vehicle> vehicleList;

    // Constructor of the Inventory class that initializes Inventory attributes
    public Inventory(int inventoryId, VehicleType type) {
        this.inventoryId = inventoryId;
        this.type = type;
        this.vehicleList = new ArrayList<>();
    }

    // Getter methods for the attributes of Inventory class
    public int getInventoryId() {return inventoryId;}
    public VehicleType getType() {return type;}
    public List<Vehicle> getVehicleList() {return vehicleList;}

    // public method addVehicle() that takes in object of type Vehicle and adds to the vehicleList list
    public String addVehicle(Vehicle vehicle) {
        // only adds vehicle if its type matches the inventory type
        if (vehicle.getType() == type) {
            vehicleList.add(vehicle);
            return String.format("Vehicle with ID %d added to the inventory", vehicle.getVehicleId());
        }
        else {
            return String.format("Vehicle ID %d with type %s does not match inventory type %s", vehicle.getVehicleId(), vehicle.getType(), type);
        }
    }

    // public method removeVehicle() that takes in object of type Vehicle and removes from vehicleList list
    public String removeVehicle(Vehicle vehicle) {
        vehicleList.remove(vehicle);
        return  String.format("Vehicle with ID %d removed from the inventory", vehicle.getVehicleId());
    }
}

