/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author a
 */
public class IngredientPreparer {
    
    public void prepareIngredients() {
        String[] ingredients = {
            "Flour", "Eggs", "Sugar", "Butter", "Mango"
        };
        for (String ingredient : ingredients) {
            System.out.println("Measuring" + ingredient);
        }
    }
}
