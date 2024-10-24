/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PF;

/**
 *
 * @author a
 */
class Library {
    private NotificationService notificationService;

    public Library() {
        this.notificationService = new NotificationService();
    }

    public void borrowBook(Book book, Member member) {
        // Kitaab borrow karne ka logic
        String message = "borroed book: " + book.getTitle();
        notificationService.sendnotification(message, member);
    }

    public void returnBook(Book book, Member member) {
        // Kitaab return karne ka logic
        String message = "book returened: " + book.getTitle();
        notificationService.sendnotification(message, member);
    }
}
