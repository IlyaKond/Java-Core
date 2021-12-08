package ru.geekbrains.lesson_1;

public class Team {
    private String nameTeam;
    private String nameParticipant;
    private int numParticipant;
    public static int countTeam=0;

    public Team(String nameTeam, String nameParticipant, int numParticipant) {
        this.nameTeam = nameTeam;
        this.nameParticipant = nameParticipant;
        this.numParticipant = numParticipant;
    }
    public void putMeInArray(Team[] teams, int arrayIndex) {
        teams[arrayIndex] = this;}
    public String getNameTeam() {
        return nameTeam;
    }

    public String getNameParticipant() {
        return nameParticipant;
    }

    public int getNumParticipant() {
        return numParticipant;
    }
   public void infoTeam() {
        System.out.println("В команде " + this.nameTeam + " состоят " + this.numParticipant + " человека:" + this.nameParticipant);
    }
}
