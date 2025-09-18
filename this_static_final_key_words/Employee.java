class Employee {
    static String companyName = "TechCorp";
    static int totalEmployees = 0;
    final int id;
    String name, designation;

    Employee(String name, int id, String designation) {
        this.name = name;
        this.id = id;
        this.designation = designation;
        totalEmployees++;
    }

    static void displayTotalEmployees() {
        System.out.println("Total Employees: " + totalEmployees);
    }

    void displayDetails() {
        if (this instanceof Employee) {
            System.out.println("Company: " + companyName + ", Name: " + name + ", ID: " + id + ", Designation: " + designation);
        }
    }

    public static void main(String[] args) {
        Employee e1 = new Employee("Ravi", 1, "Manager");
        Employee e2 = new Employee("Neha", 2, "Developer");
        e1.displayDetails();
        e2.displayDetails();
        Employee.displayTotalEmployees();
    }
}
