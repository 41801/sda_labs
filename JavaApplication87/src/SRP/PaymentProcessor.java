/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package SRP;

/**
 *
 * @author a
 */
// Payment interface
interface Payment {
    void processPayment(double amount);
}

// CreditCard class
class CreditCard implements Payment {
    public void processPayment(double amount) {
        // Code to process credit card payment
        System.out.println("Processing Credit Card Payment of " + amount);
    }
}

// PayPal class
class PayPal implements Payment {
    public void processPayment(double amount) {
        // Code to process PayPal payment
        System.out.println("Processing PayPal Payment of " + amount);
    }
}

// PaymentProcessor class
public class PaymentProcessor {
    public void process(Payment paymentMethod, double amount) {
        paymentMethod.processPayment(amount);
    }

    public static void main(String[] args) {
        PaymentProcessor processor = new PaymentProcessor();
        
        Payment creditCard = new CreditCard();
        processor.process(creditCard, 100.0);
        
        Payment payPal = new PayPal();
        processor.process(payPal, 150.0);
    }
}

