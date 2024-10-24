/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.creator;

/**
 *
 * @author UBH Laptops
 */
class Order {
    private String[] items;

    public Order(String[] items) {
        this.items = items;
    }

    public void displayOrder() {
        System.out.println("Order contains:");
        for (String item : items) {
            System.out.println("- " + item);
        }
    }
}
