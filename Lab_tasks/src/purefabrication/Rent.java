/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package purefabrication;

/**
 *
 * @author a
 */
class Rent {
    public void rentVideo(VideoStore store, String videoTitle) {
        Video video = store.getVideo(videoTitle);
        if (video != null) {
            System.out.println("Renting video: " + video.getTitle());
        } else {
            System.out.println("Video not found: " + videoTitle);
        }
    }
}
