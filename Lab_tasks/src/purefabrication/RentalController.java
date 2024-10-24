/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package purefabrication;

/**
 *
 * @author a
 */

class RentalController {
    private VideoStore store;
    private Rent rentProcess;

    public RentalController(VideoStore store) {
        this.store = store;
        this.rentProcess = new Rent();
    }


    public void rentVideo(String videoTitle) {
        System.out.println("\nCustomer wants to rent: " + videoTitle);
        rentProcess.rentVideo(store, videoTitle);
    }
}

