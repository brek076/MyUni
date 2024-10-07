package org.University;

public class Student {
    private String FIO;
    private int idGroup = -1;
    private int idTicket;
    private double averageScore;

    public Student(String FIO, int idGroup, int idTicket, double averageScore) {
        this.FIO = FIO;
        this.idGroup = idGroup;
        this.idTicket = idTicket;
        this.averageScore = averageScore;
    }

    public Student(String FIO, int idTicket, double averageScore) {
        this.FIO = FIO;
        this.idTicket = idTicket;
        this.averageScore = averageScore;
    }

    public void changeGroup(int newIdGroup){
        this.idGroup = newIdGroup;
    }

    public void addAverageScore(double averageScore) {
        this.averageScore += averageScore;
    }
}
