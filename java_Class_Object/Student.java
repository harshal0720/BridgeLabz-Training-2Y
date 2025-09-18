class Student {
    private String name;
    private int rollNumber;
    private int marks;

    Student(String name, int rollNumber, int marks) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.marks = marks;
    }

    char calculateGrade() {
        if (marks >= 90) return 'A';
        else if (marks >= 75) return 'B';
        else if (marks >= 50) return 'C';
        else return 'D';
    }

    void displayDetails() {
        System.out.println("Name: " + name + ", Roll: " + rollNumber + ", Marks: " + marks + ", Grade: " + calculateGrade());
    }

    public static void main(String[] args) {
        Student s1 = new Student("Amit", 101, 85);
        s1.displayDetails();
    }
}
