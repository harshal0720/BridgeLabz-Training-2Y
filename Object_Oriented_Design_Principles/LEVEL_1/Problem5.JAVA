import java.util.*;

class Course {
    String name;
    Professor professor;
    List<Student> students = new ArrayList<>();
    Course(String name) { this.name = name; }
    void assignProfessor(Professor p) {
        professor = p;
        System.out.println(p.name + " teaches " + name);
    }
    void enrollStudent(Student s) {
        students.add(s);
        System.out.println(s.name + " enrolled in " + name);
    }
}

class Student {
    String name;
    Student(String name) { this.name = name; }
    void enrollCourse(Course c) { c.enrollStudent(this); }
}

class Professor {
    String name;
    Professor(String name) { this.name = name; }
}

public class Problem5 {
    public static void main(String[] args) {
        Student s1 = new Student("Anita");
        Student s2 = new Student("Raj");
        Professor p1 = new Professor("Dr. Rao");
        Course c1 = new Course("Data Structures");
        c1.assignProfessor(p1);
        s1.enrollCourse(c1);
        s2.enrollCourse(c1);
    }
}
