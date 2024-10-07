package org.University;

import java.util.ArrayList;

public class StudentsGroup {
    private int idGroup;
    private String titleFaculty;
    private int course;
    private ArrayList<Student> studentsList = new ArrayList<Student>();

    public StudentsGroup(int idGroup, String titleFaculty, int course) {
        this.idGroup = idGroup;
        this.titleFaculty = titleFaculty;
        this.course = course;
    }

    public StudentsGroup(int idGroup, String titleFaculty, int course, ArrayList<Student> studentsList) {
        this.idGroup = idGroup;
        this.titleFaculty = titleFaculty;
        this.course = course;
        this.studentsList = studentsList;
    }

    public void addStudent(Student student){
        this.studentsList.add(student);
        student.changeGroup(this.idGroup);
    }

}
