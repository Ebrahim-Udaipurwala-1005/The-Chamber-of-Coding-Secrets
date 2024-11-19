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

    public void openLecture(){
        System.out.println("Welcome to the lecture [name of Lecture]! I'm Prof. [name of professor].");
    }

    public void closeLecture(){
        System.out.println("This is all for today. See you next week!");
    }

    public void addLecture(){
        System.out.println("The lecture [lecture name] is already held by another professor.");
    }

}
