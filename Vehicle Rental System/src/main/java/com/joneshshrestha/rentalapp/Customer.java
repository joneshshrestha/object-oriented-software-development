package com.joneshshrestha.rentalapp;
import java.util.List;
import java.util.ArrayList;

// Abstract Customer class that implements the Reportable interface
public abstract class Customer implements Reportable {
    private int ID;
    private String name;
    private double discountRate;
    private List<RentalOrder> rentalOrder;

    // Constructor of the Customer class that initializes customer attributes
    public Customer(int ID, String name, double discountRate) {
        this.ID = ID;
        this.name = name;
        this.discountRate = discountRate;
        // Initializes the rentalOrder list to store RentalOrder objects
        this.rentalOrder = new ArrayList<>();
    }

    // getter methods for the private attributes of this class
    public int getID() {return ID;}
    public String getName() {return name;}
    public double getDiscountRate() {return discountRate;}
    public List<RentalOrder> getRentalOrder() {return rentalOrder;}

    // public method addOrder() that takes in object of type RentalOrder and add to the list
    public String addOrder(RentalOrder order) {
        rentalOrder.add(order);
        return String.format("New Order added: %s", order);
    }

    // public method removeOrder() that takes in object of type RentalOrder and remove the object from the list
    public String removeOrder(RentalOrder order) {
        rentalOrder.remove(order);
        return String.format("Order removed: %s", order);
    }

    // this was in the requirements, but I have used the getter method that does the same thing to
    // generateReport in Corporate and Individual class
    public List<RentalOrder> getOrderHistory() {
        return rentalOrder;
    }

    // abstract method that generate report
    @Override
    public abstract String generateReport();
}

