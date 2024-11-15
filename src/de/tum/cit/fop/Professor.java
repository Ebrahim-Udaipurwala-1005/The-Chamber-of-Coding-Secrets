package de.tum.cit.fop;

public class Professor extends Participant {
    private String title;

    public Professor(String firstName, String lastName, String hogwartsID, String title) {
        super(firstName, lastName, hogwartsID);
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
