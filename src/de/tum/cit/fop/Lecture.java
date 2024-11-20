package de.tum.cit.fop;

import java.util.ArrayList;
import java.util.List;

public class Lecture {
    private String name;
    private String id;
    private Professor professor;
    private List<Apprentice> apprentices;
    private List<WizardAide> wizardAides;
    private List<QuidditchTrainer> quidditchTrainers;
    private LectureHall lectureHall;

    public Lecture(String name, String id, Professor professor, LectureHall lectureHall) {
        this.name = name;
        this.id = id;
        this.professor = professor;
        this.apprentices = new ArrayList<>();
        this.wizardAides = new ArrayList<>();
        this.quidditchTrainers = new ArrayList<>();
        this.lectureHall = lectureHall;
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

    public List<WizardAide> getWizardAides() {
        return wizardAides;
    }

    public void setWizardsAides(List<WizardAide> wizardAides) {
        this.wizardAides = wizardAides;
    }

    public List<QuidditchTrainer> getQuidditchTrainers() {
        return quidditchTrainers;
    }

    public void setQuidditchTrainers(List<QuidditchTrainer> quidditchTrainers) {
        this.quidditchTrainers = quidditchTrainers;
    }

    public LectureHall getLectureHall() {
        return lectureHall;
    }

    public void setLectureHall(LectureHall lectureHall) {
        this.lectureHall = lectureHall;
    }

    public void addParticipant(Participant p) {
        if (!apprentices.contains(p) && !wizardAides.contains(p) && !quidditchTrainers.contains(p) && !p.equals(professor)) {
            if (p instanceof Professor) {
                if (professor == null) {
                    professor = (Professor) p;
                } else {
                    System.out.println("This lecture already has a professor!");
                }
            } else if (p instanceof WizardAide) {
                if (((WizardAide) p).getLecture().equals(this)) {
                    wizardAides.add((WizardAide) p);
                } else {
                    apprentices.add(new Apprentice((WizardAide) p));
                }
            } else if (p instanceof QuidditchTrainer) {
                if (((QuidditchTrainer) p).getLecture().equals(this)) {
                    quidditchTrainers.add((QuidditchTrainer) p);
                } else {
                    apprentices.add(new Apprentice((QuidditchTrainer) p));
                }
            } else if (p instanceof Apprentice) {
                apprentices.add((Apprentice) p);
            } else {
                System.out.println("No such participants allowed in this lecture.");
            }
        } else {
            System.out.println(p.getName() + " hogwartsID:" + p.getHogwartsID() + " already attends/holds the lecture.");
        }
    }

    public void addParticipants(List<Participant> participants) {
        for (Participant p : participants) {
            addParticipant(p);
        }
    }

    public void takePlace(){
        lectureHall.placeApprentices(this.getApprentices());
        professor.openLecture(this);
        professor.closeLecture(this);
        lectureHall.empty();
    }
}