package fr.ensai.mediaplayer;

import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Represents a podcast with essential attributes.
 */
public class Podcast extends Media {
    private String host;
    private String topic;
    private String subtitles;

    /**
     * Constructs a new Podcast object.
     * @param title   The title of the podcast.
     * @param host   The host of the podcast.
     * @param topic   The topic of the podcast.
     * @param duration  The duration of the podcast.
     * @param year   The year of the podcast.
     * @param subtitles   The subtitles of the podcast.
     */
    public Podcast(String title, String host, String topic, int duration, int year, String subtitles) {
        super(title, year, duration);
        this.host = host;
        this.topic = topic;
        this.subtitles = subtitles;
    }

    /**
     * String representation of the Podcast.
     */
    @Override
    public String toString() {
        return "Podcast " + this.title + " topic : " + this.topic;
    }
    
    /**
     * Play a podcast the "subtitles" attribute
     * 
     */
    @Override
    public void play() {
        try {
            // Extract list of words from subtitles
            String[] words = subtitles.split(" ");
            for (String word : words) {
                System.out.print(word + " ");
                Thread.sleep(100);
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            System.err.println("Thread was interrupted");
        }
    }

}