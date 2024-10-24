/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication87;

/**
 *
 * @author a
 */

class FirstClass extends Seats {
    @Override
    public double calculateSeatPrice(int numberOfSeats) {
        return numberOfSeats * 500.0; 
    }
}