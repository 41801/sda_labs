/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package javaapplication87;

/**
 *
 * @author a
 */
public class AirlineTicketSystem {

   
    public static void main(String[] args) {
        Seats business = new BusinessClass();
        Seats first = new FirstClass();
        int businessSeats = 5;
        int firstClassSeats = 3;
        int economySeats = 10;

        System.out.println("Total Business Class Price:" + business.calculateSeatPrice(businessSeats));
        System.out.println("Total First Class Price:" + first.calculateSeatPrice(firstClassSeats));
      
    }
}
    

