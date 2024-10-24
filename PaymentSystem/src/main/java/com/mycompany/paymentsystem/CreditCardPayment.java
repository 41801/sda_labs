/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.paymentsystem;

/**
 *
 * @author UBH Laptops
 */
public class CreditCardPayment implements PaymentMethod{
    public void processPayment(double amount){
         System.out.println("Processing credit card payment of $" + amount);
    }
}
