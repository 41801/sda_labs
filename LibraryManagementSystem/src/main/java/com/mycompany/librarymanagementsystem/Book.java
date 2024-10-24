/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.librarymanagementsystem;

/**
 *
 * @author UBH Laptops
 */
public class Book extends LibraryItem {
    public String genre;

    public Book(String title, String author, int publicationYear, String genre) {
        super(title, author, publicationYear);
        this.genre = genre;
    }

    @Override
    public void displayInfo() { // Method name corrected
        System.out.println("Book: " + title + ", Author: " + author + ", Year: " + publicationYear + ", Genre: " + genre);
    }
}
