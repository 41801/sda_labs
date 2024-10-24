/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package purefabrication;

/**
 *
 * @author a
 */
// CustomerOrder class: Represents an order created by the waiter
class CustomerOrder {
    private final String dish;
    private final double price;

    public CustomerOrder(String dish, double price) {
        this.dish = dish;
        this.price = price;
    }

    public void showOrder() {
        System.out.println("Dish: " + dish + ", Price: " + price);
    }
}

// Waiter class: Responsible for creating CustomerOrder objects
class Waiter {
    private final String name;

    public Waiter(String name) {
        this.name = name;
    }

    // Creator pattern: Waiter creates the CustomerOrder
    public CustomerOrder createOrder(String dish, double price) {
        return new CustomerOrder(dish, price);
    }
}

// Usage
public class Restaurant {
    public static void main(String[] args) {
        // The waiter creates an order
        Waiter waiter = new Waiter("John");
        CustomerOrder order = waiter.createOrder("Pasta", 12.50);

        // Show the order details
        order.showOrder();
    }
}

