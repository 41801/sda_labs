/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.multipleinheritance;

/**
 *
 * @author UBH Laptops
 */
public class MultipleInheritance {

    public static void main(String[] args) {
       Dog dog = new Dog();
        dog.bark(); // Implementing CanBark interface
        dog.run();  // Implementing CanRun interface
    }
}
