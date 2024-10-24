/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LAB7;

/**
 *
 * @author a
 */
public class ConnectionManager {
    private static ConnectionManager ConnectionInstance;
    
    private ConnectionManager(){
        
    }
    public static ConnectionManager getInstance(){
        if (ConnectionInstance== null){
            ConnectionInstance =new ConnectionManager ();
        }
    return ConnectionInstance;
    
}
        public void executeQuery(String query) {

        System.out.println("Executing query: " + query);
    }
}
    
    

    
