package Marker_Interfaces;

// File: SensitiveDataDemo.java
interface Sensitive {}

class UserData implements Sensitive {
    String username = "Harshal";
    String password = "12345";
}

public class SensitiveDataDemo {
    public static void main(String[] args) {
        UserData user = new UserData();
        if (user instanceof Sensitive)
            System.out.println("UserData is marked as sensitive. Encrypt before saving!");
    }
}
