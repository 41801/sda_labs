/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.cityparkinglotsystem;

/**
 *
 * @author UBH Laptops
 */
class StandardSpace extends ParkingSpace {
    public StandardSpace() {
        super("Standard", 7.00);
    }

    @Override
    public double getRate() {
        return rate;
    }
}