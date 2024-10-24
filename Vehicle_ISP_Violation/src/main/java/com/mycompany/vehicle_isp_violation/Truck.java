/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.vehicle_isp_violation;

/**
 *
 * @author UBH Laptops
 */
public class Truck implements Vehicle {
    @Override
    public void drive() {
        System.out.println("Truck is driving");
    }

    @Override
    public void fly() {
        System.out.println("Truck cannot fly");
    }
}

