package fr.ensai.mediaplayer;


/**
 * Represents a playlist with essential attributes.
 */
public class Playlist {
    private String name;
    private List<Media> mediaList = new ArrayList<>();
    private int totalDuration == 0;

    /**
     * Constructs a new Playlist object.
     * @param name  The name of the playlist.
     */
    public Playlist(String name) {
        this.name = name ;
    }

    // Constructor of copy
    public Playlist(Playlist p) {
        this.name = p.getName();
    }

    // return the name of the playlist
    public String getName() {
        return this.name;
    }

    // return the list of medias of the playlist
    public List<Media> getMediaList() {
        return this.mediaList;
    }

    // return the total duration of the playlist
    public int getTotalDuration() {
        return this.totalDuration;
    }
    
    // Add an media to the podcast
    public void addMedia(Media media) {
        mediaList.add(media);
        this.totalDuration += media.getDuration();
    }

    // Remove an media from the podcast
    public void removeMedia(Media media) {
        mediaList.remove(media);
    }

    // Remove an media from the podcast by its index
    public void removeMedia(int i) {
        mediaList.remove(i);
    }

    // Play the playlist
    public void play(){
        if (this.getMediaList.isEmpty()){
            System.out.println("None media in the playlist.");
        } else {
            for (Media media : mediaList){
                if (media instanceof Song) {
                    Song song = (Song) media;
                    song.play()
                } 

                if (media instanceof Podcast) {
                    Podcast podcast = (Podcast) media;
                    podcast.play()
                } 
            }
        }
    }

}