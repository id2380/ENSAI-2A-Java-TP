package fr.ensai.library;

import java.time.LocalDate;

/**
 * Represents a loan of an item by a student.
 */
public class Loan {
    private Student student;
    private Item item;
    private LocalDate startDate;
    private LocalDate returnDate;

    public Loan(Student student, Item item) {
        this.student = student;
        this.item = item;
        this.startDate = LocalDate.now();
        this.returnDate = null; // Not yet returned
    }

    public void setReturnDate() {
        this.returnDate = LocalDate.now();
    }

    public Item getItem() {
        return item;
    }

    @Override
    public String toString() {
        return "📚 '" + item.title + "' emprunté par " + student.getName() +
            (returnDate == null ? " (Non retourné)" : " (Retourné le " + returnDate + ")");
    }
}
