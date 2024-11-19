package de.tum.cit.fop;

public class Apprentice extends Participant{
    private Lecture lecture;
    public Apprentice(String firstName, String lastName, String hogwartsID, Lecture lecture) {
        super(firstName, lastName, hogwartsID);
    }

    public Lecture getLecture() {
        return lecture;
    }

    public void setLecture(Lecture lecture) {
        this.lecture = lecture;
    }

}