/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.cityparkinglotsystem;

/**
 *
 * @author UBH Laptops
 */
abstract class ParkingSpace {
    public String type;
    public double rate;

    public ParkingSpace(String type, double rate) {
        this.type = type;
        this.rate = rate;
    }

    // Abstract method to be implemented by each specific parking space class
    public abstract double getRate();

    public String getType() {
        return type;
    }
}