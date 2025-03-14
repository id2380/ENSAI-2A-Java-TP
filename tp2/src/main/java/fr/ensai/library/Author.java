package fr.ensai.library;

import java.util.Objects;

public class Author {

    // Attributes
    private String name;

    // Constructor
    public Author(String name) {
        this.name = name;
    }

    // Methods
    public String getName() {
        return this.name;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;

        Author author = (Author) obj;
        return Objects.equals(name, author.name);
    }

    @Override
    public String toString() {
        return "Author " + name;
    }
}
