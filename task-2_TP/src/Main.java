import org.University.ConditionalGroup;
import org.University.Student;
import org.University.StudentsGroup;

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student("SSS", 1, 4.4);
        Student s2 = new Student("WWW", 2, 4.9);
        Student s3 = new Student("DDD", 3, 3.8);
        Student s4 = new Student("AAA", 3, 5);


        StudentsGroup Q1 = new StudentsGroup(1, "PIvMeh",2);
        Q1.addStudent(s1);
        Q1.addStudent(s2);
        Q1.addStudent(s3);

        // Сформировать группу,
        // положить в переменную с типом интерфейса ???

        StudentsGroup Q2 = new StudentsGroup(2, "FIIT",2);
        Q2.addStudent(s4);

        ConditionalGroup CG = new ConditionalGroup();
        CG.addStudentToGroup(s1);
        CG.addStudentToGroup(s4);

        CG.raiseAverageScore(s1, 0.5);
        CG.raiseAverageScore(s4, 5);

        CG.studentExpulsion(s1);


    }
}