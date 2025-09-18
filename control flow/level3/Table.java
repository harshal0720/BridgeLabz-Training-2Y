import java.util.Scanner;

public class Table {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {  // Auto-closes scanner
            int number = sc.nextInt();
            for (int i = 6; i <= 9; i++) {
                System.out.println(number + " * " + i + " = " + (number * i));
            }
        }
    }
}
