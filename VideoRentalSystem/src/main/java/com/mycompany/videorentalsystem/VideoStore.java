/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.videorentalsystem;

/**
 *
 * @author UBH Laptops
 */
public interface VideoStore {
     void addVideo(Video video);
    Video findVideoByTitle(String title);
}
