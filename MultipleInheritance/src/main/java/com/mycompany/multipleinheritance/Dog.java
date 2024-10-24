/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.multipleinheritance;

/**
 *
 * @author UBH Laptops
 */
class Dog implements CanBark, CanRun {
    @Override
    public void bark() {
        System.out.println("Dog barks");
    }

    @Override
    public void run() {
        System.out.println("Dog runs");
    }
}