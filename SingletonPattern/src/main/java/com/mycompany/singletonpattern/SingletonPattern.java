/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.singletonpattern;

/**
 *
 * @author UBH LAPTOPS
 */
public class SingletonPattern {

    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance();
        singleton.displayMessage();

        Singleton anotherSingleton = Singleton.getInstance();
        System.out.println("Are both instances the same? " + (singleton == anotherSingleton));
    }
}
