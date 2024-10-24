/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author a
 */
public class CityParkingLotSystem {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     
        
        ParkingSpace standardSpace = new StandardSpace();
        ServicePackage additionalPackage = new ServicePackage();

        ParkingLot parkingLot = new ParkingLot(standardSpace, additionalPackage);

     
        int hoursParked = 3;
        boolean wantsAdditionalPackage = true;  // Customer wants additional services
        double totalFee = parkingLot.calculateTotalFee(hoursParked, wantsAdditionalPackage);
      

     
        System.out.println("Total Fee: " + totalFee + " rupees");
    }
}

    
    

