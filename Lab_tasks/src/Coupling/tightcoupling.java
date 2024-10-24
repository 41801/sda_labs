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
    private Engine engine;

    public Car() {
        engine = new Engine(); // Tight coupling here
    }

    public void drive() {
        engine.start();
        System.out.println("Car is driving");
    }
}



// Main Class
public class tightcoupling {
    public static void main(String[] args) {
        Car car = new Car();
        car.drive();
    }
}
