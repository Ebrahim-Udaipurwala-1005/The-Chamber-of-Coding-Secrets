package de.tum.cit.fop;

public abstract class Participant {
    private String firstName;
    private String lastName;
    private String hogwartsId;

    public Participant(String firstName, String lastName, String hogwartsId) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.hogwartsId = hogwartsId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getHogwartsId() {
        return hogwartsId;
    }

    public void setHogwartsId(String hogwartsId) {
        this.hogwartsId = hogwartsId;
    }

    public String getName(){
        return getFirstName() + " " + getLastName();
    }
}
