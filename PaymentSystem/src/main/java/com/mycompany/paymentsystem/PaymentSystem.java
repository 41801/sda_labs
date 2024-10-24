/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.paymentsystem;

/**
 *
 * @author UBH Laptops
 */
public class PaymentSystem {

    public static void main(String[] args) {
        PaymentMethod creditCard = new CreditCardPayment();
        PaymentMethod paypal = new PayPalPayment();
        PaymentMethod bankTransfer = new BankTransferPayment();

        creditCard.processPayment(100.0);  // Process credit card payment
        paypal.processPayment(50.0);        // Process PayPal payment
        bankTransfer.processPayment(200.0); // Process bank transfer payment
    }
}
