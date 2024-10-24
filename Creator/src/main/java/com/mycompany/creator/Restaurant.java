/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.creator;

/**
 *
 * @author UBH Laptops
 */
class Restaurant {
    public Order createOrder(String[] items) {
        // Creator principle (Restaurant creates Order object)
        return new Order(items);
    }
}