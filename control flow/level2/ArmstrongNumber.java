import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        int originalNumber = number;
        int sum = 0;

        // Loop until number becomes 0
        while (originalNumber != 0) {
            int digit = originalNumber % 10;    // extract last digit
            sum += digit * digit * digit;       // add cube of digit to sum
            originalNumber /= 10;               // remove last digit
        }

        if (sum == number) {
            System.out.println(number + " is an Armstrong number");
        } else {
            System.out.println(number + " is not an Armstrong number");
        }

        sc.close();
    }
}
