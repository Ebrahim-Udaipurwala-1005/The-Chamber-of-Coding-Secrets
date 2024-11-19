package de.tum.cit.fop;

import java.util.List;

public class Lecture {
    private String id;
    private String name;

    public Lecture(String id, String name) {
        this.id = id;
        this.name = name;
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

    public void addParticipant(Participant p) {

    }

    public void addParticipants(List<Participant> particpants) {

    }

    public void takePlace(){

    }
}
