package de.tum.cit.fop;

public class Apprentice extends Participant{
    public Apprentice(String firstName, String lastName, String hogwartsID) {
        super(firstName, lastName, hogwartsID);
    }

    public Apprentice(WizardAide wizardAide){
        super(wizardAide.getFirstName(), wizardAide.getLastName(), wizardAide.getHogwartsID());
    }

    public Apprentice(QuidditchTrainer quidditchTrainer){
        super(quidditchTrainer.getFirstName(), quidditchTrainer.getLastName(), quidditchTrainer.getHogwartsID());
    }
}