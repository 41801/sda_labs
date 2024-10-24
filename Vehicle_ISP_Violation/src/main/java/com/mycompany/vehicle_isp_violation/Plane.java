/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.vehicle_isp_violation;

/**
 *
 * @author UBH Laptops
 */
public class Plane implements Vehicle {
    @Override
    public void drive() {
        System.out.println("Plane cannot drive");
    }

    @Override
    public void fly() {
        System.out.println("Plane is flying");
    }
}
