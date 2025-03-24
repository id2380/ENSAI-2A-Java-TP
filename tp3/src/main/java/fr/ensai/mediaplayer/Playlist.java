package fr.ensai.mediaplayer;


/**
 * Represents a playlist with essential attributes.
 */
public class Playlist {
    private String name;
    private List<Media> mediaList = new ArrayList<>();
    private int totalDuration ;

    /**
     * Constructs a new Playlist object.
     * @param name  The name of the playlist.
     * @param mediaList  The list of medias of the playlist.
     * @param totalDuration  The total duration of the playlist.
     */
    public Playlist(String name, List<Media> mediaList, int totalDuration) {
        this.name = name ;
        this.mediaList = mediaList ;
        this.totalDuration = totalDuration ; 
    }
    
    // Add an media to the podcast
    public void addMedia(Media media) {
        mediaList.add(media);
    }

    // Remove an media from the podcast
    public void removeMedia(Media media) {
        mediaList.remove(media);
    }

}