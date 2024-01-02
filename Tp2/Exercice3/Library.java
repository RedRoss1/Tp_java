package Exercice3;

import java.util.ArrayList;
import java.util.List;

class Library {
    private List<Book> bookInventory;

    public Library() {
        this.bookInventory = new ArrayList<>();
    }

    public void addBook(Book book) {
        bookInventory.add(book);
        System.out.println("Book added to the library: " + book.getTitle());
    }

    public void removeBook(Book book) {
        bookInventory.remove(book);
    }
    
    public void listAllBooks() {
        System.out.println("The books in the library are :");
        for (Book book : bookInventory) {
            System.out.println("- " + book.getTitle() + " by " + book.getAuthor() + " (" + book.getyear() + ")");
        }
    }
}
