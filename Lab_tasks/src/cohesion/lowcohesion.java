/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cohesion;

/**
 *
 * @author a
 */
// Low Cohesion Example
class Utility {
    private String message;

    public void printMessage() {
        System.out.println("Message: " + message);
    }

    public void calculateSum(int a, int b) {
        System.out.println("Sum: " + (a + b));
    }

    public void displayDate() {
        System.out.println("Date: " + java.time.LocalDate.now());
    }
}

// Main Class
public class lowcohesion {
    public static void main(String[] args) {
        Utility utility = new Utility();
        utility.printMessage(); // unrelated functionality
        utility.calculateSum(5, 10); // unrelated functionality
        utility.displayDate(); // unrelated functionality
    }
}

