package Exercice2;

import java.util.ArrayList;
import java.util.List;

public class Instructor {

    private int instructorId;
    private String firstName;
    private String lastName;

    public Instructor(int instructorId, String firstName, String lastName) {
        this.instructorId = instructorId;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public int getInstructorId() {
        return instructorId;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
}

