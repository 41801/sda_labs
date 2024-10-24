/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author a
 */
public class MangoMaker {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        IngredientPreparer IP= new IngredientPreparer();
        Mixer m=new Mixer();
        baker b=new baker();
        ToppingPrepare p= new ToppingPrepare();
        Decorater d= new  Decorater();
        Cleaner c= new Cleaner();
        
        
        IP.prepareIngredients();
        
        m.mixIngredients();
        
        
        
      p.prepareMangoTopping();
      
      d.decorateCake();
      
      c.CleanKitchen();
        
        
        
 //Mango maker class contains different method which is not relevant to thier class and  makes fatty class 
//,So solution is every class must contain their relevant methods and attributes which is relevant to their
//class and that type of class holds single responsibility principle     
        
    }
}
      

   
   










