/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.payment_isp_violation;

/**
 *
 * @author UBH Laptops
 */
public class PayPalPayment implements PaymentMethod {
    
     @Override
    public void processPayPalPayment() {
        System.out.println("Processing PayPal payment.");
    }
    
    @Override
    public void processCreditCardPayment() {
        // This method is not relevant for PayPal payments
        System.out.println("PayPal processor does not support credit card payments.");
    }
    
    @Override
    public void processBankTransferPayment() {
        // This method is not relevant for PayPal payments
        System.out.println("PayPal processor does not support bank transfer payments.");
    }
}