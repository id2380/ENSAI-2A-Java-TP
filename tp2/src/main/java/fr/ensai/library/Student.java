package fr.ensai.library;

/**
 * Represents a student who can borrow items.
 */
public class Student {
    private String name;
    private int age;
    private int academicYear;
    private boolean isClassDelegate;

    public Student(String name, int age, int academicYear, boolean isClassDelegate) {
        this.name = name;
        this.age = age;
        this.academicYear = academicYear;
        this.isClassDelegate = isClassDelegate;
    }

    public String getName() {
        return name;
    }

    public int getAcademicYear() {
        return academicYear;
    }

    public boolean isClassDelegate() {
        return isClassDelegate;
    }

    @Override
    public String toString() {
        return name + " (Year " + academicYear + ")";
    }
}
