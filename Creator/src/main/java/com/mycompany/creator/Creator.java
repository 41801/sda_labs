/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.creator;

/**
 *
 * @author UBH Laptops
 */
public class Creator {

    public static void main(String[] args) {
        Restaurant restaurant = new Restaurant();

        // Creating an order
        String[] foodItems = {"Burger", "Fries", "Coke"};
        Order order = restaurant.createOrder(foodItems);  // Restaurant is the Creator

        order.displayOrder();  // Display the order details
    }
}
