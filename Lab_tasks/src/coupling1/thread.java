/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package coupling1;

/**
 *
 * @author a
 */
class Singleton {
    // Step 1: Create a private static variable to hold the single instance of the class
    private static Singleton instance;

    // Step 2: Make the constructor private so that no other class can instantiate it
    private Singleton() {
        // Private constructor to prevent direct instantiation
    }

    // Step 3: Provide a public method to return the single instance, using synchronized for thread safety
    public static synchronized Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton(); // Create the instance if it doesn't exist
        }
        return instance; // Return the single instance
    }

    public void showMessage() {
        System.out.println("Hello from Singleton!");
    }
}

public class thread {
    public static void main(String[] args) {
        // Step 4: Access the Singleton instance
        Singleton singleton = Singleton.getInstance();
        singleton.showMessage();
    }
}

