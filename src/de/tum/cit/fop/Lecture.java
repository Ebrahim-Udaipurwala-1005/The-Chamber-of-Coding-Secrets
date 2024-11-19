package de.tum.cit.fop;

import java.util.List;

public class Lecture {
    private String id;
    private String name;
    private Professor professor;

    public Lecture(String id, String name, Professor professor) {
        this.id = id;
        this.name = name;
        this.professor = professor;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public void addParticipant(Participant p) {

    }

    public void addParticipants(List<Participant> particpants) {

    }

    public void takePlace(){

    }
}
