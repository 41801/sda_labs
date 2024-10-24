/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.payment_isp_violation;

/**
 *
 * @author UBH Laptops
 */
public class BankTransferPayment implements PaymentMethod {
    @Override
    public void processCreditCardPayment() {
        // This method is not relevant for bank transfer payments
        System.out.println("Bank transfer processor does not support credit card payments.");
    }

    @Override
    public void processPayPalPayment() {
        // This method is not relevant for bank transfer payments
       System.out.println("Bank transfer processor does not support PayPal payments.");
    }
    
    @Override
    public void processBankTransferPayment() {
        System.out.println("Processing bank transfer payment.");
    }
}