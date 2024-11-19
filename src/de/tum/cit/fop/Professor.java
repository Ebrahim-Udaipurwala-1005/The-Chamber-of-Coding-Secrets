package de.tum.cit.fop;

import java.util.ArrayList;
import java.util.List;

public class Professor extends Participant {
    private String title;
    private List<Lecture> lectures;

    public Professor(String firstName, String lastName, String hogwartsID, String title) {
        super(firstName, lastName, hogwartsID);
        this.title = title;
        lectures = new ArrayList<Lecture>();
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void openLecture(Lecture lecture) {
        System.out.println("Welcome to the lecture [name of Lecture]! I'm Prof. [name of professor].");
    }

    public void closeLecture(Lecture lecture) {
        System.out.println("This is all for today. See you next week!");
    }

    public void addLecture(Lecture lecture) {
        System.out.println("The lecture [lecture name] is already held by another professor.");
    }

    @Override
    public String toString() {
        return title + " " + super.getName();
    }
}
