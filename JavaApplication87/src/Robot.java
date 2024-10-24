/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author a
 */

    class Robot implements Worker {
    @Override
    public void responsibility() {
        System.out.println("Robot's responsibility is to automate tasks.");
    }

    @Override
    public double salary() {
        // Not applicable for Robot
        return 0.0;  
    }

    @Override
    public int leave() {
        // Not applicable for Robot
        return 0;    
    }
}

    
