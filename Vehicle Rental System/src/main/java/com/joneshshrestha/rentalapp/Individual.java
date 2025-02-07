package com.joneshshrestha.rentalapp;

// Individual class that inherits Customer abstract class
public class Individual extends Customer {
    private int age;
    private String state;
    private String zip;

    // Constructor for Individual class that calls the super class constructor using super() keyword
    public Individual(int ID, String name, double discountRate, int age, String state, String zip) {
        super(ID, name, discountRate);
        this.age = age;
        this.state = state;
        this.zip = zip;
    }

    // Implements the generateReport() method from the Customer class
    @Override
    // creates a new instance (object) of the StringBuilder class
    public String generateReport() {
        StringBuilder report = new StringBuilder();
        report.append("Individual Detail: ").append("\n")
                .append("  ID: ").append(getID()).append(", ")
                .append("Name: ").append(getName()).append(", ")
                .append("Age: ").append(age).append(", ")
                .append("State: ").append(state).append(", ")
                .append("Zip: ").append(zip).append(", ")
                .append("Discount Rate: ").append(getDiscountRate()).append("\n");
        // loops through each order in the rentalOrder list of Customer class
        for (RentalOrder order : getRentalOrder()) {
            report.append("  Vehicles Rent Detail: ").append("\n")
                    .append("    Vehicle ID: ").append(order.getVehicle().getVehicleId()).append(", ")
                    .append("Vehicle Type: ").append(order.getVehicle().getType()).append(", ")
                    .append("Vehicle Make: ").append(order.getVehicle().getMake()).append(", ")
                    .append("Vehicle Model: ").append(order.getVehicle().getModel()).append(", ")
                    .append("Rental Cost Per Day: ").append(order.getTotalCost()).append(", ")
                    .append("Rental Length: ").append(order.getRentalLength()).append(" day(s)").append(", ")
                    .append("Total Cost: ").append(order.getTotalCost()).append("\n");
        }
        // Converts the StringBuilder into a String and returns the report
        return report.toString();
    }
}

