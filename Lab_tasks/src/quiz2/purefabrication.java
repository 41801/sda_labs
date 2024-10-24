/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package quiz2;

/**
 *
 * @author a
 */
// pure fabrication. order validator is purely fabricated class it is not a rel world entity

class Order {
    // Public fields
    Customer customer =null;
    Product product;
}

class Customer {
    // Public field
    String name;
}

class Product {
    // Public fields
    String productName;
    double price;
}

// Pure Fabrication Class
class OrderValidator {
    public static boolean validate(Order order) {
        // Simple validation logic
        if (order.customer == null) {
            System.out.println("Invalid order: No customer.");
            return false;
        }
        if (order.product == null) {
            System.out.println("Invalid order: No product.");
            return false;
        }
        return true;
    }
}

public class purefabrication {
    public static void main(String[] args) {
        // Creating instances and setting fields directly
        Customer customer = new Customer();
        customer.name = null;
        
        Product product = new Product();
        product.productName = "Laptop";
        product.price = 1200.00;

        Order order = new Order();
        order.customer = customer;
        order.product = product;

        // Validate the order using the OrderValidator
        if (OrderValidator.validate(order)) {
            System.out.println("Order is valid.");
        } else {
            System.out.println("Order is invalid.");
        }
    }
}
