package fr.ensai.mediaplayer;

/**
 * Represents a Artist with essential attributes.
 */
public class Artist {
    private String firstName;
    private String lastName;
    private String nationality;

    /**
     * Constructs a new Artist object.
     *
     * @param firstName   The first name of the Artist.
     * @param lastName    The last name of the Artist.
     * @param nationality   The nationality of the Artist.
     */
    public Artist(String firstName, String lastName, String nationality) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.nationality = nationality;
    }

    /**
     * String representation of the Artist.
     */
    @Override
    public String toString() {
        return "Artist " + this.firstName + " " + this.lastName;
    }

    // Getters
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getNationality() {
        return nationality;
    }
 