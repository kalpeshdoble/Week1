import java.util.Scanner;

public class QuotientReminder {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        // Take the input
        int number1 = sc.nextInt();
        int number2 = sc.nextInt();
        int quotient = number1 / number2;
        int reminder = number1 % number2;

        // Print the result
        System.out.println("The Quotient is " + quotient + " and Reminder is " + reminder + " of two number " + number1
                + " and " + number2);
    }
}
