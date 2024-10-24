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
public class Potato extends Vegetable{
   

    void cut(){
        System.out.println("This is cut method..");
    }
    
    void showprint(){
        System.out.println(super.price+" "+super.calories+" "+super.color);
    }
}
