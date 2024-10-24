/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.librarymanagementsystem;

/**
 *
 * @author UBH Laptops
 */
public abstract class LibraryItem {
    public String title;
    public String author;
    protected int publicationYear;

    public LibraryItem(String title, String author, int publicationYear) {
        this.title = title;
        this.author = author;
        this.publicationYear = publicationYear;
    }
    
    public abstract void displayInfo(); // Ensure method name matches

    public void checkOut() {
        System.out.println(title + " has been checked out.");
    }

    public void returnItem() {
        System.out.println(title + " has been returned.");
    }
}