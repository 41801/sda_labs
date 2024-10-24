/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.payment_isp_violation;

/**
 * Violation of ISP: Single large interface
 */
public interface PaymentMethod {
    void processCreditCardPayment();
    void processPayPalPayment();
    void processBankTransferPayment();
}

