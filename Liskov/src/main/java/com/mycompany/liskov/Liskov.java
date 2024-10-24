/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.liskov;

/**
 *
 * @author UBH Laptops
 */
public class Liskov {

    public static void main(String[] args) {
       Animal cat = new Cat();
       Animal robotCat = new RobotCat();
       cat.makeSound();  // Outputs: Meow
       robotCat.makeSound();  // Outputs: Robot sound

    }
}
