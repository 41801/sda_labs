/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab_8.question2;

/**
 *
 * @author a
 */
// AdapterPatternDemo.java
public class Adapterpattren{
    public static void main(String[] args) {
    
        USPlug usPlug = new USPlug();
        EuropeanSocket socketAdapter = new SocketAdapter(usPlug);

        socketAdapter.plugIn();
    }
}

