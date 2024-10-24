/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package purefabrication;

/**
 *
 * @author a
 */
    public class Main {
    public static void main(String[] args) {
      
        VideoStore store = new ConcreteVideoStore();
        store.addVideo(new ConcreteVideo("1) Inception"));
        store.addVideo(new ConcreteVideo("2) The Matrix"));
        store.listVideos();
       
        RentalController controller = new RentalController(store);
        controller.rentVideo("Inception");  
        controller.rentVideo("Avatar");   
    }
}
