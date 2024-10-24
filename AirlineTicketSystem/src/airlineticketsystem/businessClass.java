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
public class businessClass {
    int numberOfrSeats=20;
    int priceperseat=1500;

    
    public int calculateSeatPrice(){
        return numberOfrSeats*priceperseat;
    }
}
