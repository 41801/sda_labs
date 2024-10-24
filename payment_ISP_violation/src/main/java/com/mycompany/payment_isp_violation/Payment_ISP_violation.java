/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.payment_isp_violation;

/**
 *
 * @author UBH Laptops
 */
public class Payment_ISP_violation {

    public static void main(String[] args) {
        PaymentMethod creditCardPayment = new CreditCardPayment();
        creditCardPayment.processPayPalPayment();
        
        PaymentMethod payPalPayment = new PayPalPayment();
        payPalPayment.processCreditCardPayment();

        PaymentMethod bankTransferPayment = new BankTransferPayment();
        bankTransferPayment.processPayPalPayment();
    }
}
