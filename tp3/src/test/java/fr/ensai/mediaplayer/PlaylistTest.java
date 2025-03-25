package fr.ensai.mediaplayer;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class PlaylistTest {

    @Test
    void addMediaToPlayList() {

        // GIVEN
        // Create artist, song and a playlist
        Artist jeanFerrat = new Artist("Jean", "Ferrat", "Française");

        Song laMontagne = new Song(
            "La Montagne", // title
            jeanFerrat, // singer
            1965, // year
            181, // duration (seconds)
            "Ils quittent un à un le pays " +
            "Pour s'en aller gagner leur vie, loin de la terre où ils sont nés " +
            "Depuis longtemps ils en rêvaient " +
            "De la ville et de ses secrets, du formica et du ciné " +
            "Les vieux, ça n'était pas original " +
            "Quand ils s'essuyaient machinal, d'un revers de manche les lèvres " +
            "Mais ils savaient tous à propos " +
            "Tuer la caille ou le perdreau et manger la tomme de chèvre", // lyrics
            jeanFerrat, // author
            jeanFerrat, // composer
            List.of(Genre.CHANSON_FRANCAISE) // genre
        );

        Playlist maPlayList = new Playlist("Ma PlayList");

        // WHEN
        maPlayList.addMedia(laMontagne);

        // THEN
        assertEquals(laMontagne, maPlayList.getMediaList().get(0));
        assertEquals(181, maPlayList.getTotalDuration());
    }

    @Test
    void removeMediaToPlayList() {

        // GIVEN
        // Create artist, song and a playlist
        Artist klausMeine = new Artist("Klaus", "Meine", "Allemande");

        Song hurricane = new Song(
            "Rock You Like A Hurricane", // title
            klausMeine, // singer
            1984, // year
            251, // duration (seconds)
            "It's early morning, the sun comes out " +
            "Last night was shaking and pretty loud " +
            "My cat is purring, it scratches my skin " +
            "So what is wrong with another sin?", // lyrics
            klausMeine, // author
            klausMeine, // composer
            List.of(Genre.ROCK) // genre
        );

        Playlist maPlayListRock = new Playlist("Ma Playlist Rock") ;

        // WHEN
        maPlayListRock.addMedia(hurricane);
        maPlayListRock.removeMedia(hurricane);

        // THEN
        assertEquals(0, maPlayListRock.getMediaList().size());
        assertEquals(0, maPlayListRock.getTotalDuration());
    }
}