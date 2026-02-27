package Defining_and_Implementing_Interfaces;

// File: PaymentDemo.java
interface Payment {
    void pay(double amount);
}

class UPI implements Payment {
    public void pay(double amount) { System.out.println("Paid ₹" + amount + " via UPI"); }
}

class CreditCard implements Payment {
    public void pay(double amount) { System.out.println("Paid ₹" + amount + " via Credit Card"); }
}

class Wallet implements Payment {
    public void pay(double amount) { System.out.println("Paid ₹" + amount + " via Wallet"); }
}

public class PaymentDemo {
    public static void main(String[] args) {
        Payment upi = new UPI();
        Payment card = new CreditCard();
        Payment wallet = new Wallet();

        upi.pay(1000);
        card.pay(2500);
        wallet.pay(500);
    }
}
