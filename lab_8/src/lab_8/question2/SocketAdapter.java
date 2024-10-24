/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab_8.question2;

/**
 *
 * @author a
 */
// SocketAdapter.java
public class SocketAdapter implements EuropeanSocket {
    private USPlug usPlug;

    // Constructor that accepts the USPlug object
    public SocketAdapter(USPlug usPlug) {
        this.usPlug = usPlug;
    }

    // Adapts the US plug to fit into the European socket
    @Override
    public void plugIn() {
        System.out.println("Adapting US plug to fit into European socket...");
        usPlug.insertTwoProngPlug(); // Call the method of the USPlug (Adaptee)
        System.out.println("US plug adapted to fit the European socket.");
    }
}

