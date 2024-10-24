/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package LAB7;

/**
 *
 * @author a
 */
public class Singleton {

    public static void main(String[] args) {
     
     ConnectionManager dbManager1 = ConnectionManager.getInstance();
        dbManager1.executeQuery("SELECT * FROM users");

      ConnectionManager dbManager2 = ConnectionManager.getInstance();
        dbManager2.executeQuery("SELECT * FROM orders");
        if (dbManager1 == dbManager2) {
            System.out.println("Both instances are the same. ");
        } else {
            System.out.println("Instances are different. ");
        }
    }
}
