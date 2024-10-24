/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.cityparkinglotsystem;

/**
 *
 * @author UBH Laptops
 */
public class CityParkingLotSystem {

    public static void main(String[] args) {
      String vehicleType = "standard"; 
        int hours = 3; 
        boolean addPackage = true; 

        ParkingSpace space = null;

        if (vehicleType.equalsIgnoreCase("compact")) {
            space = new CompactSpace();
        } else if (vehicleType.equalsIgnoreCase("standard")) {
            space = new StandardSpace();
        } else if (vehicleType.equalsIgnoreCase("oversized")) {
            space = new OversizedSpace();
        } else {
            System.out.println("Invalid vehicle type.");
            return;
        }

        EnhancedService service = null;
        if (addPackage) {
            service = new EnhancedService(300); // Package cost is 300
        }

        // Create a parking session and calculate the fee
        ParkingSession session = new ParkingSession(space, hours, service);
        FeeCalculator feeCalculator = new FeeCalculator();
        double totalFee = feeCalculator.calculateFee(session);

        // Output the result
        System.out.println("Parking Type: " + session.getParkingType());
        System.out.println("Total parking fee: " + totalFee + " rupees");
    }
}
