import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        int userInput = 5;
        int number[] = new int[userInput];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < userInput; i++) {
System.out.println("enter the number");

            number[i] = sc.nextInt();
        }
        for (int i = 0; i < userInput; i++) {
            if (number[i] > 0) {
                if (number[i] % 2 == 0) {
                    System.out.println("The positive number " + number[i] + " even number");
                } else {
                    System.out.println("The number positive " + number[i] + " odd number");
                }
            } else if (number[i] == 0) {
                System.out.println("The number " + number[i] + " is zero");
            } else {
                System.out.println("The number " + number[i] + " is negative");
            }

        }
        for (int i = 0; i < 1; i++) {
            if (number[i] == number[userInput - 1]) {
                System.out.println("The first and last number are equal");
            } else if (number[i] > number[userInput - 1]) {
                System.out.println("The first number is greater");
            } else {
                System.out.println("The first number is small");
            }
        }
    }
}
