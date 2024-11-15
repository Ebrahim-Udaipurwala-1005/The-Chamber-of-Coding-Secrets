package de.tum.cit.fop;

public class QuidditchTrainer extends Participant {
    public QuidditchTrainer(String firstName, String lastName, String hogwartsID) {
        super(firstName, lastName, hogwartsID);
    }

    public String toString() {
        return "Quidditch Trainer " + getName();
    }
}
