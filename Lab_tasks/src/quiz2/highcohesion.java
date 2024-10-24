/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package quiz2;

/**
 *
 * @author a
 */
// high coheson , a class is performing its dedicated functionalities only

class Calculator {
    // Method to add two numbers
    public int add(int a, int b) {
        return a + b;
    }

    // Method to subtract two numbers
    public int subtract(int a, int b) {
        return a - b;
    }

    // Method to multiply two numbers
    public int multiply(int a, int b) {
        return a * b;
    }

    // Method to divide two numbers
    public double divide(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("Cannot divide by zero");
        }
        return (double) a / b;
    }
}

public class highcohesion {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        
        System.out.println("Addition: " + calculator.add(5, 3));          // Output: 8
        System.out.println("Subtraction: " + calculator.subtract(5, 3));  // Output: 2
        System.out.println("Multiplication: " + calculator.multiply(5, 3)); // Output: 15
        System.out.println("Division: " + calculator.divide(5, 3));        // Output: 1.666...
    }
}
