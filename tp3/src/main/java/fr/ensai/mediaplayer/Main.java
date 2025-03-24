package fr.ensai.mediaplayer;

public class Main {

    public static void main(String[] args) {


         // Create artist and song
        Artist jeanFerrat = new Artist("Jean", "Ferrat", "Française");
        Song laMontage = new Song(
            "La Montagne", // title
            jeanFerrat, // singer
            1965, // year
            120, // duration
            "Ils quittent un à un le pays
            Pour s'en aller gagner leur vie, loin de la terre où ils sont nés
            Depuis longtemps ils en rêvaient
            De la ville et de ses secrets, du formica et du ciné
            Les vieux, ça n'était pas original
            Quand ils s'essuyaient machinal, d'un revers de manche les lèvres
            Mais ils savaient tous à propos
            Tuer la caille ou le perdreau et manger la tomme de chèvre", //lyrics
            jeanFerrat, // author
            jeanFerrat, // composer
            List.of("Chanson française")); // genre

        // Play the song
        laMontage.play();

    }
}
