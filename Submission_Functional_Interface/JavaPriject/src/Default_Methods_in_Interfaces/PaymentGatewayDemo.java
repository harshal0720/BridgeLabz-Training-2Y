package Default_Methods_in_Interfaces;

// File: PaymentGatewayDemo.java
interface PaymentProcessor {
    void pay(double amount);
    default void refund(double amount) {
        System.out.println("Refund of ₹" + amount + " processed successfully.");
    }
}

class Paytm implements PaymentProcessor {
    public void pay(double amount) { System.out.println("Paid ₹" + amount + " via Paytm."); }
}

public class PaymentGatewayDemo {
    public static void main(String[] args) {
        Paytm p = new Paytm();
        p.pay(1200);
        p.refund(300);
    }
}
