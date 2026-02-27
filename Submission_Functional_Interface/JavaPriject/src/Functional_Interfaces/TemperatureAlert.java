package Functional_Interfaces;

// File: TemperatureAlert.java
import java.util.function.Predicate;

public class TemperatureAlert {
    public static void main(String[] args) {
        Predicate<Double> isHighTemp = t -> t > 40.0;
        double temp = 42.5;
        if (isHighTemp.test(temp))
            System.out.println("ALERT! Temperature is high: " + temp);
        else
            System.out.println("Temperature normal.");
    }
}
