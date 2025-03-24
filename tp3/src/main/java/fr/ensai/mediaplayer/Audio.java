package fr.ensai.mediaplayer;

/**
 * Abstract class for audios and podcasts
 */
public abstract class Audio{
    // Attributes
    protected String title;
    protected int year;
    protected int duration;

    /**
     * Constructs a new Audio object.
     *
     * @param title    The title of the audio.
     * @param year     The year the audio was released.
     * @param duration The duration of the audio in seconds.
     */
    public Audio(String title, int year, int duration){
        this.title = title;
        this.year = year;
        this.duration = duration;
    }

    public abstract String toString(); // abstract method to be implemented in subsclasses

    public abstract String equals(); // abstract method to be implemented in subsclasses

    public abstract void play() ; // abstract method to be implemented in subsclasses