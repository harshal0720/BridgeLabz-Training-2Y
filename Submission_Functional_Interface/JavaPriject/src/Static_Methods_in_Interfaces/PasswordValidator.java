package Static_Methods_in_Interfaces;

// File: PasswordValidator.java
interface SecurityUtils {
    static boolean isStrong(String password) {
        return password.length() >= 8 && password.matches(".*[A-Z].*") && password.matches(".*\\d.*");
    }
}

public class PasswordValidator {
    public static void main(String[] args) {
        String pwd = "Hello123";
        System.out.println("Password Strong? " + SecurityUtils.isStrong(pwd));
    }
}
