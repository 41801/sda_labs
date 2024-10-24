/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.payment_isp_corrected;

/**
 *
 * @author UBH Laptops
 */
public class Payment_ISP_corrected {

    public static void main(String[] args) {
        CreditCardPaymentProcessor creditCardProcessor = new CreditCardPaymentProcessor();
        creditCardProcessor.processCreditCardPayment(); // This works fine
        
        PayPalPaymentProcessor payPalProcessor = new PayPalPaymentProcessor();
        payPalProcessor.processPayPalPayment(); // This works fine
        
        
        BankTransferPaymentProcessor bankTransferProcessor = new BankTransferPaymentProcessor();
        bankTransferProcessor.processBankTransferPayment(); // This works fine
    }
}
