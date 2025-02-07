package com.joneshshrestha.rentalapp;
import java.util.ArrayList;
import java.util.List;

// RentalOffice class that implements the Reportable interface
public class RentalOffice implements Reportable {
    private int officeID;
    private String locationZip;
    private List<Inventory> inventoryList;
    private List<RentalOrder> rentalOrderHistory;

    // Constructor of the RentalOffice class that initializes RentalOffice attributes
    public RentalOffice(int officeID, String locationZip) {
        this.officeID = officeID;
        this.locationZip = locationZip;
        this.inventoryList = new ArrayList<>();
        this.rentalOrderHistory = new ArrayList<>();
    }

    // public method addInventory() that takes in object of type Inventory and add to the list
    public String addInventory(Inventory inventory) {
        // stream() method allows for filtering operations and noneMatch() method returns True if no elements in the list satisfy the condition, else False
        // condition inside noneMatch() iterates through each inv (Inventory Object) in inventoryList and checks if its type is equal to
        // the type of the inventory being added
        if (inventoryList.stream().noneMatch(inv -> inv.getType() == inventory.getType())) {
            inventoryList.add(inventory);
            return String.format("Vehicle type %s added to the inventory of office with officeID %d", inventory.getType(), officeID);
        } else {
            return String.format("Vehicle type %s already added to the inventory of office with officeID %d", inventory.getType(), officeID);
        }
    }

    // public method removeInventory() that takes in object of type Inventory and removes from the list
    public String removeInventory(Inventory inventory) {
        inventoryList.remove(inventory);
        return String.format("Vehicle type %s removed from the inventory of office with officeID %d", inventory.getType(), officeID);
    }

    // public method addOrder() that takes in object of type RentalOrder and adds to the list rentalOrderHistory
    public String addOrder(RentalOrder order) {
        rentalOrderHistory.add(order);
        return "Vehicle order added successfully!";
    }

    // Implements the generateReport() method from the Reportable interface
    @Override
    // creates a new instance (object) of the StringBuilder class
    public String generateReport() {
        StringBuilder report = new StringBuilder();
        report.append("Office ID: ").append(officeID).append("\n")
                .append("Location Zip: ").append(locationZip).append("\n")
                .append("Inventory List: ").append("\n");
        // loops through each Inventory object (inv) in the inventoryList of RentalOffice class
        for (Inventory inv : inventoryList) {
            report.append(" Inventory ID: ").append(inv.getInventoryId()).append(", ")
                    .append(" Type: ").append(inv.getType()).append("\n")
                    .append(" Vehicles in this Inventory: ").append("\n");
            // loops through each Vehicle object (vehicle) inside the vehicleList of Inventory
            for (Vehicle vehicle : inv.getVehicleList()) {
                report.append("    Vehicle ID: ").append(vehicle.getVehicleId()).append(", ")
                        .append("Make: ").append(vehicle.getMake()).append(", ")
                        .append("Model: ").append(vehicle.getModel()).append(", ")
                        .append("Year: ").append(vehicle.getYear()).append(", ")
                        .append("Mileage: ").append(vehicle.getMileage()).append(", ")
                        .append("Available: ").append(vehicle.getAvailable()).append(", ")
                        .append("Daily Rate: ").append(vehicle.getDailyRate()).append("\n");
            }
        }
        report.append("Rental Order History: ").append("\n");
        // loops through each RentalOrder object (order) in the rentalOrderHistory list of RentalOrder class
        for (RentalOrder order : rentalOrderHistory) {
            report.append("Customer Detail: ").append("\n")
                    .append("  Customer ID: ").append(order.getCustomer().getID()).append(", ")
                    .append("Customer Name: ").append(order.getCustomer().getName()).append(", ")
                    .append("Customer DiscountRate: ").append(order.getCustomer().getDiscountRate()).append("\n");
            report.append("  Vehicles Rent Detail: ").append("\n")
                    .append("    Vehicle ID: ").append(order.getVehicle().getVehicleId()).append(", ")
                    .append("Vehicle Type: ").append(order.getVehicle().getType()).append(", ")
                    .append("Vehicle Make: ").append(order.getVehicle().getMake()).append(", ")
                    .append("Vehicle Model: ").append(order.getVehicle().getModel()).append(", ")
                    .append("Rental Length: ").append(order.getRentalLength()).append(" day(s)").append(", ")
                    .append("Total Cost: ").append(order.getTotalCost()).append("\n");
        }
        // Converts the StringBuilder into a String and returns the report
        return report.toString();
    }
}