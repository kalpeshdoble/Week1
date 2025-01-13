import java.util.Scanner;

public class NumberFormatExceptionExample {

   
    public static void generateException(String inputText) {
       
        int number = Integer.parseInt(inputText); // This will throw NumberFormatException if input is not a valid integer
        System.out.println("Parsed number: " + number); 
    }

 
    public static void handleException(String inputText) {
        try {
            // Call the method that generates the exception
            generateException(inputText);
        } catch (NumberFormatException e) {
            // Handle the specific NumberFormatException
            System.out.println("NumberFormatException caught: " + e.getMessage());
            System.out.println("Invalid input! Please enter a valid number.");
        } catch (RuntimeException e) {
            // Handle any other RuntimeException
            System.out.println("RuntimeException caught: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
      
        Scanner scanner = new Scanner(System.in);
        
        // Take user input for a string
        System.out.print("Enter a number: ");
        String userInput = scanner.nextLine();
        
        // Call the method that handles the exception
        handleException(userInput);
        
       
    }
}
