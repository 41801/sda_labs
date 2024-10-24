/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author a
 */
class ParkingLot {
    private ParkingSpace parkingSpace;   // Loose coupling with ParkingSpace interface
    private ServicePackage servicePackage;

    public ParkingLot(ParkingSpace parkingSpace, ServicePackage servicePackage) {
        this.parkingSpace = parkingSpace;
        this.servicePackage = servicePackage;
    }

    public double calculateTotalFee(int hours, boolean addServicePackage) {
        double baseFee = parkingSpace.calculateFee(hours);
        double totalFee = baseFee;
        if (addServicePackage) {
            totalFee += servicePackage.getFee();
        }
        return totalFee;
    }
}

