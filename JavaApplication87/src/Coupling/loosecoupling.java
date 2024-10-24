/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Coupling;

/**
 *
 * @author a
 */
class Engine {
    public void start() {
        System.out.println("Engine started");
    }
}

class Car {
    public Engine engine;

    public Car(Engine engine) { // Loose coupling here
        
    }

    public void drive() {
        engine.start();
        System.out.println("Car is driving");
    }
}

// Main Class
public class loosecoupling {
    public static void main(String[] args) {
        Engine engine = new Engine(); // Create Engine instance
        Car car = new Car(engine); // Pass Engine instance to Car
        car.drive();
    }
}

