/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author a
 */
class OversizedSpace implements ParkingSpace {
    private static final double RATE_PER_HOUR = 10.00;

    public double calculateFee(int hours) {
        return hours * RATE_PER_HOUR;
    }
}
