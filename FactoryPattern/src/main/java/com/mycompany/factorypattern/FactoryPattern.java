/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.factorypattern;

/**
 *
 * @author UBH LAPTOPS
 */
// Base class
interface Car {
    void drive();
}
// Concrete classes
class Sedan implements Car {
    @Override
    public void drive() {
        System.out.println("Driving a sedan");}}
class SUV implements Car {
    @Override
    public void drive() {
        System.out.println("Driving an SUV");
    }
}
// Factory class
class CarFactory {
    public static Car createCar(String carType) {
        if (carType.equalsIgnoreCase("sedan")) {
            return new Sedan();
        } else if (carType.equalsIgnoreCase("suv")) {
            return new SUV();
        } else {
            throw new IllegalArgumentException("Unknown car type");}}}
// Client code
public class FactoryPattern {
    public static void main(String[] args) {
        CarFactory factory = new CarFactory();
        
        Car myCar = factory.createCar("suv");
        myCar.drive();  // Output: Driving an SUV
        
        Car anotherCar = factory.createCar("sedan");
        anotherCar.drive();  // Output: Driving a sedan
    }
}
