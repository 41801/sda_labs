/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package quiz2;

/**
 *
 * @author a
 */
// low coupling and high cohesion
interface VideoRecorder {
    void record();
}

interface VideoSaver {
    void save(String videoFileName);
}

class SimpleVideoRecorder implements VideoRecorder {
    public void record() {
        System.out.println("Recording video...");
        // Logic to record video
    }
}

class LocalVideoSaver implements VideoSaver {
    public void save(String videoFileName) {
        System.out.println("Saving video to local storage: " + videoFileName);
        // Logic to save video locally
    }
}

class CloudVideoSaver implements VideoSaver {
    public void save(String videoFileName) {
        System.out.println("Saving video to cloud: " + videoFileName);
        // Logic to save video to the cloud
    }
}

class VideoManager {
    public VideoRecorder recorder; // No encapsulation
    public VideoSaver saver; // No encapsulation

    public void recordAndSave(String videoFileName) {
        recorder.record();
        saver.save(videoFileName);
    }
}

public class main {
    public static void main(String[] args) {
        // Using SimpleVideoRecorder and LocalVideoSaver
        VideoManager videoManager = new VideoManager();
        videoManager.recorder = new SimpleVideoRecorder();
        videoManager.saver = new LocalVideoSaver();
        videoManager.recordAndSave("my_video.mp4");

        // Switching to CloudVideoSaver
        videoManager.saver = new CloudVideoSaver(); // Changing the saver
        videoManager.recordAndSave("my_video_cloud.mp4");
    }
}