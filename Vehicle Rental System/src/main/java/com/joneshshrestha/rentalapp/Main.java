package com.joneshshrestha.rentalapp;

public class Main {
    public static void main(String[] args) {
        // Create some vehicles
        Vehicle car1 = new Vehicle(1, "Toyota", "Camry", 2020, 12000, VehicleType.CAR, 20);
        Vehicle car2 = new Vehicle(2, "Honda", "Civic", 2019, 10000, VehicleType.CAR, 15);
        Vehicle suv1 = new Vehicle(3, "Ford", "Explorer", 2018, 15000, VehicleType.SUV, 25);
        Vehicle truck1 = new Vehicle(4, "Chevrolet", "Silverado", 2017, 20000, VehicleType.TRUCK, 30);

        // Create some inventories
        Inventory carInventory = new Inventory(1, VehicleType.CAR);
        Inventory suvInventory = new Inventory(2, VehicleType.SUV);
        Inventory truckInventory = new Inventory(3, VehicleType.TRUCK);

        // Add vehicles to inventories
        carInventory.addVehicle(car1);
        carInventory.addVehicle(car2);
        suvInventory.addVehicle(suv1);
        truckInventory.addVehicle(truck1);

        // Create a rental office
        RentalOffice rentalOffice = new RentalOffice(1, "60604");

        // Add inventories to rental office
        rentalOffice.addInventory(carInventory);
        rentalOffice.addInventory(suvInventory);
        rentalOffice.addInventory(truckInventory);

        // Create some customers
        Individual individual1 = new Individual(1, "Snoop Dogg", 10, 30, "IL", "60208");
        Corporate corporate1 = new Corporate(2, "DePaul University.", 15, "USA", "1234567890");

        // Create some rental orders
        RentalOrder order1 = new RentalOrder(individual1, car1, 3);
        RentalOrder order2 = new RentalOrder(corporate1, suv1, 5);

        // Complete rental orders
        order1.completeOrder();
        order2.completeOrder();

        // Add rental orders to rental office's order history
        rentalOffice.addOrder(order1);
        rentalOffice.addOrder(order2);

        // Print rental office report to console
        Report.printToConsole(rentalOffice);

        // Persist rental office report to CSV
        Report.persistToCSV(rentalOffice, "rental_office_report.csv");

        // Print individual customer report to console
        Report.printToConsole(individual1);
    }
}

