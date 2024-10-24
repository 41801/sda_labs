/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.vehicle_isp_corrected;

/**
 *
 * @author UBH Laptops
 */
public class Vehicle_ISP_Corrected {

    public static void main(String[] args) {
      Drivable car = new Car();
        Drivable truck = new Truck();
        Flyable plane = new Plane();

        car.drive();
        truck.drive();
        plane.fly();
    }
}
