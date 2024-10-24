/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author a
 */
public class Employee implements Worker{
    @Override
    public void responsibility() {
        System.out.println("Employee's responsibilities include managing projects.");
    }

    @Override
    public double salary() {
        return 5000.00;
    }

    @Override
    public int leave() {
        return 20;
    }
}
