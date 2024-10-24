/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.videorentalsystem;

/**
 *
 * @author UBH Laptops
 */
public class VideoRentalSystem {

    public static void main(String[] args) {
        // Step 1: Create a video store
        ConcreteVideoStore videoStore = new ConcreteVideoStore(); 
        videoStore.addVideo(new ConcreteVideo("Inception"));
        videoStore.addVideo(new ConcreteVideo("The Matrix"));

        // Step 2: Create the controller
        RentalController rentalController = new RentalController(videoStore);

        // Step 3: Rent videos
        rentalController.rentVideo("Inception");  
        rentalController.rentVideo("Avatar");     
    }
}
