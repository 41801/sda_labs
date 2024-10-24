/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author a
 */
class StandardSpace implements ParkingSpace {
    private static final double RATE_PER_HOUR = 7.00;

    @Override
    public double calculateFee(int hours) {
        return hours * RATE_PER_HOUR;
    }
}
