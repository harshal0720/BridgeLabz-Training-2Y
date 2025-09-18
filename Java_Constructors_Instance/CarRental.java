class CarRental {
    private String customerName;
    private String carModel;
    private int rentalDays;
    private double totalCost;

    CarRental(String customerName, String carModel, int rentalDays) {
        this.customerName = customerName;
        this.carModel = carModel;
        this.rentalDays = rentalDays;
        this.totalCost = calculateCost();
    }

    private double calculateCost() {
        return rentalDays * 1000.0;
    }

    void display() {
        System.out.println("Customer: " + customerName + ", Car: " + carModel + ", Days: " + rentalDays + ", Total: " + totalCost);
    }

    public static void main(String[] args) {
        CarRental c1 = new CarRental("Ravi", "SUV", 5);
        c1.display();
    }
}
