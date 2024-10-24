/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.videorentalsystem;

/**
 *
 * @author UBH Laptops
 */
class RentalController {
    public VideoStore store; // Store reference

    public RentalController(VideoStore store) {
        this.store = store;
    }

    public void rentVideo(String videoTitle) {
        Video video = store.findVideoByTitle(videoTitle);
        if (video != null) {
            Rent rent = new Rent(video, store);
            rent.rentVideo(); // Rent the video
        } else {
            System.out.println("Video not found: " + videoTitle);
        }
    }
}