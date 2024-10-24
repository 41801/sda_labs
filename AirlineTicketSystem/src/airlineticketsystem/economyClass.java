/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package airlineticketsystem;

/**
 *
 * @author Riphah
 */
public class economyClass {
    int numberOfSeats=30;
    int priceperseat=500;

    public int calculateSeatPrice(){
        return numberOfSeats*priceperseat;
    }
}
