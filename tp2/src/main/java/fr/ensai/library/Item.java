package fr.ensai.library;

/**
 * Abstract class for books and magazines
 */
public abstract class Item{
    // Attributes
    protected String title;
    protected int year;
    protected int pageCount;

    public Item(String title, int year, int pageCount){
        this.title = title;
        this.year = year;
        this.pageCount = pageCount;
    }

    public abstract String toString();
}