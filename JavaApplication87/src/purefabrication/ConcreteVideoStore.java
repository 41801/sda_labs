/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package purefabrication;

/**
 *
 * @author a
 */

import java.util.ArrayList;
import java.util.List;

class ConcreteVideoStore implements VideoStore {
    private List<Video> videos = new ArrayList<>();

    @Override
    public void addVideo(Video video) {
        videos.add(video);
    }

    @Override
    public Video getVideo(String title) {
        for (Video video : videos) {
            if (video.getTitle().equalsIgnoreCase(title)) {
                return video;
            }
        }
        return null;
    }

    @Override
    public void listVideos() {
        System.out.println("Available Videos:");
        for (Video video : videos) {
            System.out.println(video.getTitle());
        }
    }
}

