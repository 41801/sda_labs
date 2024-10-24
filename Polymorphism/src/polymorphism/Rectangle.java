/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polymorphism;

/**
 *
 * @author Riphah
 */
public class Rectangle extends Shape{
 
   float length=30;
   float width=20;
    
    @Override
    public double calculateArea() {
        return length*width; //To change body of generated methods, choose Tools | Templates.
    }
    
}
