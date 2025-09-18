import java.util.*;

class Faculty {
    String name;
    Faculty(String name) { this.name = name; }
}

class Department {
    String name;
    Department(String name) { this.name = name; }
}

class University {
    String name;
    List<Department> departments = new ArrayList<>();
    List<Faculty> faculties = new ArrayList<>();
    University(String name) { this.name = name; }
    void addDepartment(Department d) { departments.add(d); }
    void addFaculty(Faculty f) { faculties.add(f); }
    void deleteUniversity() {
        departments.clear();
        System.out.println(name + " deleted along with departments");
    }
}

public class Problem2 {
    public static void main(String[] args) {
        University u = new University("Tech University");
        Department d1 = new Department("CSE");
        Department d2 = new Department("ECE");
        Faculty f1 = new Faculty("Dr. John");
        Faculty f2 = new Faculty("Dr. Smith");
        u.addDepartment(d1);
        u.addDepartment(d2);
        u.addFaculty(f1);
        u.addFaculty(f2);
        u.deleteUniversity();
        System.out.println("Faculty " + f1.name + " still exists independently");
    }
}
