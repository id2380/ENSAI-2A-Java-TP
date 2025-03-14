package fr.ensai.library;

import java.util.List;
import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.net.URL;
import java.util.Map;
import java.util.HashMap;

/**
 * Represents a library that stores books and manages loans.
 */
public class Library {
    // Attributes
    private String name;
    private List<Item> items = new ArrayList<>();
    private List<Loan> activeLoans = new ArrayList<>();
    private List<Loan> completedLoans = new ArrayList<>();

    // Constructor
    public Library(String name) {
        this.name = name;
    }

    // Add an item to the library
    public void addItem(Item item) {
        items.add(item);
    }

    // Display all items
    public void displayItems() {
        if (items.isEmpty()) {
            System.out.println("Aucun livre ou magazine dans cette bibliothèque.");
            return;
        }
        for (Item item : items) {
            System.out.println(item);
        }
    }

    /**
     * Find an active loan for an item.
     */
    public Loan findActiveLoanForItem(Item item) {
        for (Loan loan : activeLoans) {
            if (loan.getItem().equals(item)) {
                return loan;
            }
        }
        return null;
    }

    /**
     * Get all books by a specific author.
     */
    public ArrayList<Book> getBooksByAuthor(Author author) {
        ArrayList<Book> booksByAuthor = new ArrayList<>();
        for (Item item : items) {
            if (item instanceof Book) {
                Book book = (Book) item;
                if (book.getAuthor().equals(author)) {
                    booksByAuthor.add(book);
                }
            }
        }
        return booksByAuthor;
    }

    /**
     * Loan an item to a student if available.
     */
    public boolean loanItem(Item item, Student student) {
        if (findActiveLoanForItem(item) != null) {
            System.out.println(" L'item '" + item.title + "' est déjà emprunté.");
            return false;
        }

        if (!items.contains(item)) {
            System.out.println(" L'item '" + item.title + "' n'est pas disponible dans la bibliothèque.");
            return false;
        }

        Loan loan = new Loan(student, item);
        activeLoans.add(loan);
        System.out.println(item.title + " a été emprunté par " + student.getName());
        return true;
    }

    /**
     * Mark an item as returned.
     */
    public boolean renderItem(Item item) {
        Loan loan = findActiveLoanForItem(item);
        if (loan == null) {
            System.out.println("L'item '" + item.title + "' n'est pas actuellement emprunté.");
            return false;
        }

        loan.setReturnDate();
        activeLoans.remove(loan);
        completedLoans.add(loan);
        System.out.println(item.title + " a été retourné.");
        return true;
    }

    /**
     * Display all active loans.
     */
    public void displayActiveLoans() {
        if (activeLoans.isEmpty()) {
            System.out.println("Aucun emprunt actif.");
        } else {
            for (Loan loan : activeLoans) {
                System.out.println(loan);
            }
        }
    }
}
