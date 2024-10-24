/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.payment_isp_violation;

/**
 *
 * @author UBH Laptops
 */
public class CreditCardPayment implements PaymentMethod {
    @Override
    public void processCreditCardPayment() {
        System.out.println("Processing credit card payment.");
    }

    @Override
    public void processPayPalPayment() {
        // This method is not relevant for credit card payments
        System.out.println("Credit card processor does not support PayPal payments.");
    }
    
    @Override
    public void processBankTransferPayment() {
        // This method is not relevant for credit card payments
        System.out.println("Credit card processor does not support bank transfer payments.");
    }
}