package fr.ensai.library;

public class Main {

    public static void main(String[] args) {

        Library library = new Library("Ma bibliothèque");

        // Create authors and books
        Author tolkien = new Author("J.R.R. Tolkien");
        Book fellowshipOfTheRing = new Book("978-0-618-26025-6", "The Fellowship of the Ring", tolkien, 1954, 423);
        library.addItem(fellowshipOfTheRing);

        // Create magazines
        Magazine magazine1 = new Magazine("aa", 1, "baba", 1984, 100);
        Magazine magazine2 = new Magazine("bb", 2, "bobo", 1985, 101);
        library.addItem(magazine1);
        library.addItem(magazine2);

        // Create students
        Student alice = new Student("Alice Dupont", 20, 2, false);
        Student bob = new Student("Bob Martin", 22, 3, true);

        // Loan items
        library.loanItem(fellowshipOfTheRing, alice);
        library.loanItem(magazine1, bob);

        // Display active loans
        System.out.println("\n Emprunts actifs:");
        library.displayActiveLoans();

        // Return an item
        library.renderItem(fellowshipOfTheRing);

        // Display updated loans
        System.out.println("\n Emprunts actifs après retour:");
        library.displayActiveLoans();
    }
}
