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
public class AirlineTicketSystem {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        businessClass b=new businessClass();
        firstClass f=new firstClass();
        economyClass e=new economyClass();
        System.out.println(b.calculateSeatPrice());
        System.out.println(f.calculateSeatPrice());
        System.out.println(e.calculateSeatPrice());
    }
    
}
