/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.librarymanagementsystem;

/**
 *
 * @author UBH Laptops
 */
public class LibraryManagementSystem {

    public static void main(String[] args) {
        LibraryItem book = new Book("1984", "George Orwell", 1949,"Dystopian");
        LibraryItem magazine = new Magazine("National Geographic", "Various", 2023, "April"); // Corrected class name

        book.displayInfo();       // Displays book info
        magazine.displayInfo();   // Displays magazine info

        book.checkOut();          // Checks out the book
        magazine.returnItem();    // Returns the magazine
    }
    }

