package Functional_Interfaces;

// File: StringLengthChecker.java
import java.util.function.Function;

public class StringLengthChecker {
    public static void main(String[] args) {
        Function<String, Integer> getLength = s -> s.length();
        String message = "Hello Functional Interface!";
        System.out.println("Message Length: " + getLength.apply(message));
    }
}
