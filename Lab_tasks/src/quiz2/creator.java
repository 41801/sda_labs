/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package quiz2;

/**
 *
 * @author a
 */
// Online Java Compiler
/* Creator pattern using interfaces; we can also implement creator using abstract classes. This design pattern supports the single responsibility principle. */
import java.util.Scanner;

interface Vehicle {
    void displayRentalRate();
}

class Car implements Vehicle {
    public void displayRentalRate() {
        System.out.println("Car rental rate: $50 per day.");
    }
}

class Bike implements Vehicle {
    public void displayRentalRate() {
        System.out.println("Bike rental rate: $30 per day.");
    }
}

class Truck implements Vehicle {
    public void displayRentalRate() {
        System.out.println("Truck rental rate: $80 per day.");
    }
}

class VehicleFactory {
    public Vehicle createVehicle(String type) {
        switch (type.toLowerCase()) {
            case "car": // Use double quotes for strings
                return new Car();
            case "bike":
                return new Bike();
            case "truck":
                return new Truck();
            default:
                return null;
        }
    }
}

public class creator {
    public static void main(String[] args) {
        VehicleFactory factory = new VehicleFactory();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Vehicle Rental Service!");
        System.out.print("Enter the type of vehicle you want to rent (Car/Bike/Truck): ");
        String vehicleType = scanner.nextLine();

        Vehicle vehicle = factory.createVehicle(vehicleType);
        if (vehicle != null) {
            vehicle.displayRentalRate();
        } else {
            System.out.println("Invalid vehicle type selected.");
        }

        scanner.close();
    }
}
