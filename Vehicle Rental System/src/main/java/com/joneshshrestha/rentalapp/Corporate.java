package com.joneshshrestha.rentalapp;

// Corporate class that inherits Customer abstract class
public class Corporate extends Customer {
    private String country;
    private String taxID;

    // Constructor for Corporate class that calls the super class constructor using super() keyword
    public Corporate(int ID, String name, double discountRate, String country, String taxID) {
        super(ID, name, discountRate);
        this.country = country;
        this.taxID = taxID;
    }

    // Implements the generateReport() method from the Customer class
    @Override
    public String generateReport() {
        // creates a new instance (object) of the StringBuilder class
        StringBuilder report = new StringBuilder();
        report.append("Corporate Detail: ").append("\n")
                .append("  ID: ").append(getID()).append(", ")
                .append("Name: ").append(getName()).append(", ")
                .append("Country: ").append(country).append(", ")
                .append("Tax ID: ").append(taxID).append(", ")
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

