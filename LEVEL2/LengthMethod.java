import java.util.Scanner;

public class LengthMethod {

    // Method to find length of a string without using length() method
    public static int findStringLength(String str) {
        int count = 0;
        try {
            // Infinite loop to count characters using charAt()
            while (true) {
                str.charAt(count);  // This will throw an exception when count exceeds the string length
                count++;
            }
        } catch (StringIndexOutOfBoundsException e) {
            // Exception occurs when we reach the end of the string, return the count
            return count;
        }
    }

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        // Taking input string from user
        System.out.print("Enter a string: ");
        String input = scanner.next();

        // Calling the user-defined method to get the length without using length() method
        int userDefinedLength = findStringLength(input);

        // Calling the built-in length() method to get the length
        int builtInLength = input.length();

        // Displaying both the results
        System.out.println("Length of the string using user-defined method: " + userDefinedLength);
        System.out.println("Length of the string using built-in length() method: " + builtInLength);
    }
}
