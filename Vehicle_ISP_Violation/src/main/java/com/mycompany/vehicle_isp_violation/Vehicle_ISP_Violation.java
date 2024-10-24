/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.vehicle_isp_violation;

/**
 *
 * @author UBH Laptops
 */
public class Vehicle_ISP_Violation {

    public static void main(String[] args) {
       Vehicle car = new Car();
        Vehicle plane = new Plane();
        Vehicle truck = new Truck();

        car.drive();
        truck.drive();
        plane.fly();
        plane.drive();
        
        truck.fly();
        car.fly();
        plane.fly();
        
    }
}
