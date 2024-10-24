/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.officeautomationsystem_isp;

/**
 *
 * @author UBH Laptops
 */
class Employee implements Responsible, Paid, Leaveable {
    @Override
    public void responsibility() {
        System.out.println("Employee's responsibilities include managing projects.");
    }

    public double salary() {
        return 5000.00;
    }

    @Override
    public int leave() {
        return 20;
    }
}