/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.cityparkinglotsystem;

/**
 *
 * @author UBH Laptops
 */
class ParkingSession {
    public ParkingSpace space;
    public int duration; // in hours
    public EnhancedService service;

    public ParkingSession(ParkingSpace space, int duration, EnhancedService service) {
        this.space = space;
        this.duration = duration;
        this.service = service;
    }

    public double getTotalFee() {
        double baseFee = space.getRate() * duration;
        if (service != null) {
            baseFee += service.getCost();
        }
        return baseFee;
    }

    public String getParkingType() {
        return space.getType();
    }
}