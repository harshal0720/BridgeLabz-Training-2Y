package Static_Methods_in_Interfaces;

// File: DateFormatUtility.java
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

interface DateUtils {
    static String formatDate(LocalDate date) {
        return date.format(DateTimeFormatter.ofPattern("dd-MM-yyyy"));
    }
}

public class DateFormatUtility {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        System.out.println("Formatted Date: " + DateUtils.formatDate(today));
    }
}

