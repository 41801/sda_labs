/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package PF;

/**
 *
 * @author a
 */
public class LibrarySystem {
    public static void main(String[] args) {
        Book book1 = new Book("The Great Gatsby", "F. Scott Fitzgerald");
        Member member1 = new Member("Alice", "alice@example.com");
        
        Library library = new Library();
        library.borrowBook(book1, member1);
        library.returnBook(book1, member1);
    }
}
