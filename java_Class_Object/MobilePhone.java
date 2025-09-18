class MobilePhone {
    private String brand;
    private String model;
    private double price;

    MobilePhone(String brand, String model, double price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    void displayDetails() {
        System.out.println("Brand: " + brand + ", Model: " + model + ", Price: " + price);
    }

    public static void main(String[] args) {
        MobilePhone m1 = new MobilePhone("Samsung", "Galaxy S23", 70000);
        m1.displayDetails();
    }
}
