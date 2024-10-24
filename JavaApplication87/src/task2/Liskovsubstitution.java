/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package task2;

/**
 *
 * @author a
 */
public class Liskovsubstitution {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
       
        Animal cat = new Cat();
        Animal robotCat = new RobotCat();
       
        cat.makeSound();      
        robotCat.makeSound(); 
    }
        
    }
    

