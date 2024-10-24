/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mangocakemaker;

/**
 *
 * @author UBH Laptops
 */
public class MangoCakeMaker {

    public static void main(String[] args) {
     IngredientPreparation ingredients=new IngredientPreparation();
     MixingIngredients mixing=new MixingIngredients();
     BakingCake Bake=new BakingCake();
     DecoratingCake decororating=new DecoratingCake();
     CleaningKitchen cleaning=new CleaningKitchen();
     BakingCake bake=new BakingCake();
     
     
     ingredients.prepareIngredients();
     mixing.mixIngredients();
     decororating.decorateCake();
     cleaning.cleanKitchen();
     

     
    }
}
