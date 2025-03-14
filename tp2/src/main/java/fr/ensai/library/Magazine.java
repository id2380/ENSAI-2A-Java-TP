package fr.ensai.library;

/**
 * Represents a magazine.
 */
public class Magazine extends Item {

    // Attributes
    private String issn;
    private int issueNumber;

    //constructor
    public Magazine(String issn, int issueNumber, String title, int year, int pageCount) {
        super(title, year, pageCount);
        this.issn = issn;
        this.issueNumber = issueNumber;
    }

    @Override
    public String toString() {
        return "Magazine " + title + " issn : " + issn;
    }
}   