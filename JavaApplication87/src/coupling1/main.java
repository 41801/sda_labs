/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package coupling1;

/**
 *
 * @author a
 */
// Interface for Purchase
interface IPurchase {
    void processOrder();
}

// Interface for Order
interface IOrder {
    void addOrderLine();
}

// Interface for OrderLine
interface IOrderLine {
    void addItem();
}

// Decoupled Customer class
class Customer {
    private String name;
    private IPurchase purchase;

    // Dependency injection via constructor
    public Customer(String name, IPurchase purchase) {
        this.name = name;
        this.purchase = purchase; // Loosely coupled to IPurchase interface
    }

    public void makePurchase() {
        purchase.processOrder(); // Interacts through abstraction
    }
}

// Decoupled Purchase class
class Purchase implements IPurchase {
    private IOrder order;

    // Dependency injection via constructor
    public Purchase(IOrder order) {
        this.order = order; // Loosely coupled to IOrder interface
    }

    public void processOrder() {
        order.addOrderLine(); // Interacts through abstraction
    }
}

// Decoupled Order class
class Order implements IOrder {
    private IOrderLine orderLine;

    // Dependency injection via constructor
    public Order(IOrderLine orderLine) {
        this.orderLine = orderLine; // Loosely coupled to IOrderLine interface
    }

    public void addOrderLine() {
        orderLine.addItem(); // Interacts through abstraction
    }
}

// Decoupled OrderLine class
class OrderLine implements IOrderLine {
    public void addItem() {
        System.out.println("Item added to the order");
    }
}

// Main class to demonstrate the loose coupling
public class main {
    public static void main(String[] args) {
        // Injecting dependencies at runtime
        IOrderLine orderLine = new OrderLine();
        IOrder order = new Order(orderLine);
        IPurchase purchase = new Purchase(order);
        Customer customer = new Customer("Nimra", purchase);

        customer.makePurchase();  // Process purchase with loose coupling
    }
}

