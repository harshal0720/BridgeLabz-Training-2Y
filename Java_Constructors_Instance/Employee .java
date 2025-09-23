class Employee {
    public int employeeID;
    protected String department;
    private double salary;

    Employee(int employeeID, String department, double salary) {
        this.employeeID = employeeID;
        this.department = department;
        this.salary = salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }
}

class Manager extends Employee {
    Manager(int employeeID, String department, double salary) {
        super(employeeID, department, salary);
    }

    void display() {
        System.out.println("ID: " + employeeID + ", Dept: " + department + ", Salary: " + getSalary());
    }

    public static void main(String[] args) {
        Manager m1 = new Manager(201, "IT", 70000);
        m1.setSalary(80000);
        m1.display();
    }
}
