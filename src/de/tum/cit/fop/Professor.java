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

    public List<Lecture> getLectures() {
        return lectures;
    }

    public void setLectures(List<Lecture> lectures) {
        this.lectures = lectures;
    }

    public void openLecture(Lecture lecture) {
        System.out.println("Welcome to the lecture " + lecture.getId() + "! I'm Prof. " + super.getName() + ".");
    }

    public void closeLecture(Lecture lecture) {
        System.out.println("This is all for today. See you next week!");
    }

    public void addLecture(Lecture lecture) {
        if(super.getHogwartsID().equals(lecture.getId())){
            lectures.add(lecture);
            lecture.setProfessor(this);
            return;
        }
        else if(lecture.getProfessor() == null){
            lectures.add(lecture);
            lecture.setProfessor(this);
        }
        else{
            System.out.println("The lecture " + lecture.getId() + " is already held by another professor.");
        }
    }

    @Override
    public String toString() {
        return title + " " + super.getName();
    }
}
