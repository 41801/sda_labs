/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.videorentalsystem;

/**
 *
 * @author UBH Laptops
 */
class Rent {
    public Video video; // Video to be rented
    public VideoStore store; // Store from which the video is rented

    public Rent(Video video, VideoStore store) {
        this.video = video;
        this.store = store;
    }

    public void rentVideo() {
        System.out.println("Renting video: " + video.getTitle());
    }
}
