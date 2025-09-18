class Vehicle {
    static double registrationFee = 1000.0;
    final String registrationNumber;
    String ownerName, vehicleType;

    Vehicle(String ownerName, String vehicleType, String registrationNumber) {
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
        this.registrationNumber = registrationNumber;
    }

    static void updateRegistrationFee(double newFee) {
        registrationFee = newFee;
    }

    void displayDetails() {
        if (this instanceof Vehicle) {
            System.out.println("Owner: " + ownerName + ", Type: " + vehicleType + ", Reg No: " + registrationNumber + ", Fee: " + registrationFee);
        }
    }

    public static void main(String[] args) {
        Vehicle v1 = new Vehicle("Rohit", "Car", "UP1234");
        Vehicle v2 = new Vehicle("Meera", "Bike", "DL5678");
        v1.displayDetails();
        v2.displayDetails();
        Vehicle.updateRegistrationFee(1200);
        v1.displayDetails();
    }
}
