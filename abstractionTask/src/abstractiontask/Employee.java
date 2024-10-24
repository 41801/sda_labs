/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstractiontask;

/**
 *
 * @author Riphah
 */
abstract class Employee {
    String name="Nimra";
    String email="nimrataj@gmail.com";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        System.out.println("email="+email);
        return email;
    }

    
    
    abstract void calculatePay(); 
    
}