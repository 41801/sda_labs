/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.librarymanagementsystem;

/**
 *
 * @author UBH Laptops
 */
public class Magazine extends LibraryItem { // Corrected class name
    public String issue;

    public Magazine(String title, String author, int publicationYear, String issue) {
        super(title, author, publicationYear);
        this.issue = issue;
    }

    @Override
    public void displayInfo() { // Ensure method name matches
        System.out.println("Magazine: " + title + ", Author: " + author + ", Year: " + publicationYear + ", Issue: " + issue);
    }
}
