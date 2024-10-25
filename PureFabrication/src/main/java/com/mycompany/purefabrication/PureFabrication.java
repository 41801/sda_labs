/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.purefabrication;

/**
 *
 * @author UBH Laptops
 */
public class PureFabrication {

    public static void main(String[] args) {
      double[] prices = {100, 200, 50};  // Price of ordered food items
        BillCalculator billCalculator = new BillCalculator();
        
        // Using the Pure Fabrication class to calculate the total bill
        double totalBill = billCalculator.calculateTotal(prices);
        System.out.println("Total Bill: " + totalBill + " rupees");
    }
}
