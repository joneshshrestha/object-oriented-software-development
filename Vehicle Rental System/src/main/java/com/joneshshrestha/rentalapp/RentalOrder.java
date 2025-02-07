package com.joneshshrestha.rentalapp;

public class RentalOrder {
    private double totalCost;
    private Customer customer;
    private Vehicle vehicle;
    private int rentalLength;

    // constructor overloading with only two parameters and default rentalLength 1.
    public RentalOrder(Customer customer, Vehicle vehicle) {
        // to avoid duplicate code we can call the main constructor here
        this(customer, vehicle, 1);
    }

    // main constructor where we pass rentalLength
    public RentalOrder(Customer customer, Vehicle vehicle, int rentalLength) {
        this.customer = customer;
        this.vehicle = vehicle;
        this.rentalLength = rentalLength;
        calculateTotalCost();
    }

    // getter and setter
    public double getTotalCost() {return totalCost;}
    public Customer getCustomer() {return customer;}
    public Vehicle getVehicle() {return vehicle;}
    public int getRentalLength() {return rentalLength;}

    // calculate the total cost using the getter method of dailyRate,
    // default or passed rentalLength and getter method of discountRate
    public String calculateTotalCost() {
        totalCost = vehicle.getDailyRate() * rentalLength * (1 - (customer.getDiscountRate() / 100));
        return String.format("The total cost of rental is: %.2f", totalCost);
    }

    // method completeOrder that sets the availability to false using setter method from vehicle.setAvailable
    // and returns the addOrder method where we pass the current instance of RentalOrder using 'this'
    public String completeOrder() {
        vehicle.setAvailable(false);
        customer.addOrder(this);
        return String.format("Order complete for %s", this.customer.getName());
    }
}

