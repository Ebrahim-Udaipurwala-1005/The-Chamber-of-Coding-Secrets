package de.tum.cit.fop;

import java.util.List;

public class Lecture {
    private String id;
    private String name;
    private Professor professor;
    private List<Apprentice> apprentices;
    private List<WizardAide> wizardsAides;
    private List<QuidditchTrainer> quidditchTrainers;

    public Lecture(String id, String name, Professor professor, List<Apprentice> apprentices, List<WizardAide> wizardsAides, List<QuidditchTrainer> quidditchTrainers) {
        this.id = id;
        this.name = name;
        this.professor = professor;
        this.apprentices = apprentices;
        this.wizardsAides = wizardsAides;
        this.quidditchTrainers = quidditchTrainers;
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

    public List<Apprentice> getApprentices() {
        return apprentices;
    }

    public void setApprentices(List<Apprentice> apprentices) {
        this.apprentices = apprentices;
    }

    public List<WizardAide> getWizardsAides() {
        return wizardsAides;
    }

    public void setWizardsAides(List<WizardAide> wizardsAides) {
        this.wizardsAides = wizardsAides;
    }

    public List<QuidditchTrainer> getQuidditchTrainers() {
        return quidditchTrainers;
    }

    public void setQuidditchTrainers(List<QuidditchTrainer> quidditchTrainers) {
        this.quidditchTrainers = quidditchTrainers;
    }

    public void addParticipant(Participant p) {

    }

    public void addParticipants(List<Participant> particpants) {

    }

    public void takePlace(){

    }
}
