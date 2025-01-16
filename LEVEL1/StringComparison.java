import java.util.Scanner;

public class StringComparison {

    // Method to compare two strings using charAt()
    public static boolean compareUsingCharAt(String str1, String str2) {
        // If lengths are not equal, strings can't be the same
        if (str1.length() != str2.length()) {
            return false;
        }

        // Compare each character of the strings
        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Take input for the first string
        System.out.print("Enter the first string: ");
        String string1 = scanner.next();

        // Take input for the second string
        System.out.print("Enter the second string: ");
        String string2 = scanner.next();

        // Compare strings using the custom method
        boolean resultUsingCharAt = compareUsingCharAt(string1, string2);

        // Compare strings using the built-in equals() method
        boolean resultUsingEquals = string1.equals(string2);

        // Display the results
        System.out.println("Result using charAt(): " + resultUsingCharAt);
        System.out.println("Result using equals(): " + resultUsingEquals);

        // Check if both results are the same
        if (resultUsingCharAt == resultUsingEquals) {
            System.out.println("Both methods produce the same result.");
        } else {
            System.out.println("The results from the two methods differ.");
        }

        // Close the scanner
        scanner.close();
    }
}