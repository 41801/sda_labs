/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.payment_isp_corrected;

/**
 *
 * @author UBH Laptops
 */
public class CreditCardPaymentProcessor implements CreditCardPayment {
    @Override
    public void processCreditCardPayment() {
        System.out.println("Processing credit card payment.");
    }
}