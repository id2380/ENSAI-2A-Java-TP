package fr.ensai.mediaplayer;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

/**
 * Represents a playlist with essential attributes.
 */
public class Playlist {
    private String name;
    private List<Media> mediaList = new ArrayList<>();
    private int totalDuration = 0;

    /**
     * Constructs a new Playlist object.
     * @param name  The name of the playlist.
     */
    public Playlist(String name) {
        this.name = name;
    }

    /**
     * Constructor of copy
     * 
     * @param p The playlist to copy
     */ 
    public Playlist(Playlist p) {
        this.name = p.getName();
        for (Media media : p.getMediaList()) {
            this.addMedia(media);
        }
    }

    /**
     * Add an media to the podcast
     * 
     * @param media The media to add to the playlist
     */ 
    public void addMedia(Media media) {
        mediaList.add(media);
        this.totalDuration += media.getDuration();
    }

    /**
     * Remove an media from the podcast
     * 
     * @param media The media to remove from the playlist
     */ 
    public void removeMedia(Media media) {
        mediaList.remove(media);
        totalDuration -= media.getDuration();
    }

    /**
     * Remove an media from the podcast by its index
     * 
     * @param i The index of the media to remove
     */ 
    public void removeMedia(int i) {
        if (i >= 0 && i < mediaList.size()) {
            totalDuration -= mediaList.get(i).getDuration();
            mediaList.remove(i);
        }
    }

    /**
     * Play the playlist
     * 
     * @param random If true, the playlist is played randomly
     * 
     */ 
    public void play(boolean random) {

        if (this.getMediaList().isEmpty()) {
            System.out.println("None media in the playlist.");
            return;
        } 

        // copy of the playlist
        List<Media> toPlay = new ArrayList<>(mediaList); 

        if (random) {
            // New order for the elements of the playlist
            Collections.shuffle(toPlay); 
        }

        for (Media media : toPlay) {
            media.play();
        }

    }

    // Getters
    public String getName() {
        return this.name;
    }

    public List<Media> getMediaList() {
        return this.mediaList;
    }

    public int getTotalDuration() {
        return this.totalDuration;
    }
}
