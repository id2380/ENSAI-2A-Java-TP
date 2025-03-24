package fr.ensai.mediaplayer;

import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Represents a song with essential attributes.
 */
public class Song extends Audio {
    private Artist singer;
    private String lyrics;
    private Artist author;
    private Artist composer;
    private List<Genre> genres = new ArrayList<>();

    /**
     * Constructs a new Song object.
     * @param title   The title of the song.
     * @param singer   The singer of the song.
     * @param year   The year of the song.
     * @param duration   The duration of the song.
     * @param lyrics   The lyrics of the song.
     * @param author   The author of the song.
     * @param composer The composer of the song.
     */
    public Song(
            String title, 
            Artist singer, 
            int year, 
            int duration, 
            String lyrics, 
            Artist author, 
            Artist composer,
            List<Genre> genres) {
        super(String title, int year, int duration);
        this.singer = singer;
        this.lyrics = lyrics;
        this.author = author;
        this.composer = composer;
        this.genres = genres;
    }

    /**
     * String representation of the Song.
     */
    @Override
    public String toString() {
        return "Song " + this.title + " by " + this.singer;
    }
    
    /**
     * Indicates whether some other object is "equal to" this one. Two Song
     * objects are considered equal if they have the same title, singer, and year.
     */
    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || this.getClass() != o.getClass())
            return false;
        Song otherSong = (Song) o;
        return this.year == otherSong.year &&
                Objects.equals(this.title, otherSong.title) &&
                Objects.equals(this.singer, otherSong.singer);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.title, this.singer, this.year);
    }

    /**
     * Play a song from the "lyrics" attribute
     * 
     */
    @Override
    public void play() {
        try {
            // Extract list of words from lyrics
            Stream<String> textStream = Stream.of(lyrics.split(" ")).collect(Collectors.toList());
            for(Stream<String> text : textStream){
                 System.out.print(text);
                 Thread.sleep(100);
            }
        }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            System.err.println("Thread was interrupted");
        }
    }

}