/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.videorentalsystem;

/**
 *
 * @author UBH Laptops
 */
class ConcreteVideoStore implements VideoStore {
    public Video video1; // First video
    public Video video2; // Second video
    public Video video3; // Third video
    public int count; // Track the number of videos added

    public ConcreteVideoStore() {
        count = 0;
    }
    @Override
    public void addVideo(Video video) {
        if (count == 0) {
            video1 = video;
        } else if (count == 1) {
            video2 = video;
        } else if (count == 2) {
            video3 = video;
        } else {
            System.out.println("Store is full! Cannot add more videos.");
            return;
        }
        count++;
    }
    @Override
    public Video findVideoByTitle(String title) {
        if (video1 != null && video1.getTitle().equals(title)) {
            return video1;
        }
        if (video2 != null && video2.getTitle().equals(title)) {
            return video2;
        }
        if (video3 != null && video3.getTitle().equals(title)) {
            return video3;
        }
        return null; // Return null if the video is not found
    }
}
