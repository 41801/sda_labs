/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.videorentalsystem;

/**
 *
 * @author UBH Laptops
 */
class ConcreteVideo implements Video {
    public String title; // Title of the video

    public ConcreteVideo(String title) {
        this.title = title;
    }

    @Override
    public String getTitle() {
        return title;
    }
}