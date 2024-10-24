/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package purefabrication;

/**
 *
 * @author a
 */

interface VideoStore {
    void addVideo(Video video);
    Video getVideo(String title);
    void listVideos();
}
