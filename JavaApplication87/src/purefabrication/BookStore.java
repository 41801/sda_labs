/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package purefabrication;

/**
 *
 * @author a
 */
// Pure Fabrication: The InvoiceGenerator class doesn't map to a real-world object
class InvoiceGenerator {
    public static String generateInvoice(Book book, Customer customer, double amount) {
        return "Invoice: \nCustomer: " + customer.getName() +
               "\nBook: " + book.getTitle() + 
               "\nAmount: " + amount;
    }
}

// Book class (Represents a real-world object)
class Book {
    private final String title;

    public Book(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }
}

// Customer class (Represents a real-world object)
class Customer {
    private final String name;

    public Customer(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

// Usage
public class BookStore {
    public static void main(String[] args) {
        Book book = new Book("Clean Code");
        Customer customer = new Customer("Nimra Taj");

        // Generating invoice using Pure Fabrication
        String invoice = InvoiceGenerator.generateInvoice(book, customer, 50.00);
        System.out.println(invoice);
    }
}

