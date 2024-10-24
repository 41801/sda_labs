/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritance;

/**
 *
 * @author Riphah
 */
public class Vegetable {
    double price=200;
    String color="blue";
    int calories=10;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    
    public void eat(){
        System.out.println("This is eat method..");
    }
}
