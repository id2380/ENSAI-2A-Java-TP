package fr.ensai.mediaplayer;

import java.util.List;

public class Main {

    public static void main(String[] args) {

         // Create artist and song
        Artist jeanFerrat = new Artist("Jean", "Ferrat", "Française");
        Song laMontagne = new Song(
            "La Montagne", // title
            jeanFerrat, // singer
            1965, // year
            181, // duration
            "Ils quittent un à un le pays " +
            "Pour s'en aller gagner leur vie, loin de la terre où ils sont nés " +
            "Depuis longtemps ils en rêvaient " +
            "De la ville et de ses secrets, du formica et du ciné " +
            "Les vieux, ça n'était pas original " +
            "Quand ils s'essuyaient machinal, d'un revers de manche les lèvres " +
            "Mais ils savaient tous à propos " +
            "Tuer la caille ou le perdreau et manger la tomme de chèvre", //lyrics
            jeanFerrat, // author
            jeanFerrat, // composer
            List.of(Genre.CHANSON_FRANCAISE) // genre
        );

        // Play the song
        laMontagne.play();

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
            "So what is wrong with another sin?", //lyrics
            klausMeine, // author
            klausMeine, // composer
            List.of(Genre.ROCK) // genre
        );

        Podcast entendezVousEcho = new Podcast (
           "Défense, innovation, transition : vers un nouvel interventionnisme européen?", // title
           "Jézabel Couppey-Soubeyran", // host
           "Economie", //topic
           3540, // duration
           2025, // year
           "Nous sommes à un tournant affirme l'économiste Jézabel Couppey-Soubeyran, " +
            "c'est vraiment une crise existentielle et l'Union est à la croisée des chemins. " +
            "Il s'agit de savoir si l'Europe continue de fonctionner en ordre dispersé et subit, " +
            "ou si véritablement elle parvient à s'unir et à changer son logiciel."// subtitles
        );

        // Create a new playlist
        Playlist p1 = new Playlist("p1");
        p1.addMedia(laMontagne);
        p1.addMedia(hurricane);
        p1.addMedia(entendezVousEcho);

        // Copy of p1
        Playlist p2 = new Playlist(p1);

        // Remove of "La Montagne" from p1
        p1.removeMedia(0);

        // Total duration of p1 and p2
        System.out.println("Total duration of p1: " + p1.getTotalDuration());
        System.out.println("Total duration of p2: " + p2.getTotalDuration());

        // Play p2
        System.out.println("Playing playlist p2:");
        p2.play(false);
    }
}
