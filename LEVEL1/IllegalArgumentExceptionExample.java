import java.util.Scanner;

public class IllegalArgumentExceptionExample {

    // Method to generate IllegalArgumentException by using substring with invalid indices
    public static void generateException(String inputString) {
        // Set the start index greater than the end index to generate IllegalArgumentException
        String result = inputString.substring(5, 2);  // This will throw IllegalArgumentException
        System.out.println("Substring result: " + result); // This line won't be reached if exception occurs
    }

    // Method to handle IllegalArgumentException and generic RuntimeException
    public static void handleException(String inputString) {
        try {
            // Call the method that generates the exception
            generateException(inputString);
        } catch (IllegalArgumentException e) {
            // Handle the specific IllegalArgumentException
            System.out.println("IllegalArgumentException caught: " + e.getMessage());
            System.out.println("Start index cannot be greater than end index in substring method.");
        } catch (RuntimeException e) {
            // Handle any other RuntimeException (in case of unforeseen exceptions)
            System.out.println("RuntimeException caught: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        // Create a scanner object for user input
        Scanner scanner = new Scanner(System.in);
        
        // Take user input for a string
        System.out.print("Enter a string: ");
        String userInput = scanner.nextLine();
        
        // Call the method that handles the exception
        handleException(userInput);
        
        // Close the scanner object to prevent resource leak
        scanner.close();
    }
}
