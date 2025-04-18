package fr.ensai.mediaplayer;

/**
 * Abstract class for Medias and podcasts
 */
public abstract class Media{
    // Attributes
    protected String title;
    protected int year;
    protected int duration;

    /**
     * Constructs a new Media object.
     *
     * @param title    The title of the Media.
     * @param year     The year the Media was released.
     * @param duration The duration of the Media in seconds.
     */
    public Media(String title, int year, int duration){
        this.title = title;
        this.year = year;
        this.duration = duration;
    }

    public abstract String toString(); // abstract method to be implemented in subsclasses

    public abstract void play(); // abstract method to be implemented in subsclasses

    // Getters
    public String getTitle() {
        return this.title;
    }

    public int getYear() {
        return this.year;
    }

    public int getDuration() {
        return this.duration;
    }
}