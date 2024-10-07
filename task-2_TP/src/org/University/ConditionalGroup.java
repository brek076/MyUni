package org.University;

import java.util.ArrayList;

public class ConditionalGroup implements Trainees  {
    private ArrayList<Student> studentsList = new ArrayList<Student>();

    @Override
    public void studentExpulsion(Student student) {
        studentsList.remove(student);
    }

    @Override
    public void raiseAverageScore(Student student, double score) {
        student.addAverageScore(score);
    }

    @Override
    public void addStudentToGroup(Student student) {
        studentsList.add(student);
    }
}
