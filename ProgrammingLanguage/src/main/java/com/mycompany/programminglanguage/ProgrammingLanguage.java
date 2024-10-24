/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.programminglanguage;

/**
 *
 * @author UBH Laptops
 */
public class ProgrammingLanguage implements Language{
   private String name;

    public ProgrammingLanguage(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    } 
}
