import java.util.Scanner;

public class ArrayIndexOutOfBoundsExample {

    
    public static void generateException(String[] namesArray) {
       
        String invalidName = namesArray[5];  // This will throw ArrayIndexOutOfBoundsException if the array has less than 6 elements
        System.out.println("Name at index 5: " + invalidName); 
    }

    // Method to handle ArrayIndexOutOfBoundsException and generic RuntimeException
    public static void handleException(String[] namesArray) {
        try {
            // Call the method that generates the exception
            generateException(namesArray);
        } catch (ArrayIndexOutOfBoundsException e) {
            // Handle the specific ArrayIndexOutOfBoundsException
            System.out.println("ArrayIndexOutOfBoundsException caught: " + e.getMessage());
            System.out.println("The index is out of bounds! The array size is smaller than 6.");
        } catch (RuntimeException e) {
            // Handle any other RuntimeException
            System.out.println("RuntimeException caught: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
       
        Scanner scanner = new Scanner(System.in);
        
      
        System.out.print("Enter the number of names you want to input: ");
        int n = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character left after reading the integer
        
        // Create an array of strings with the specified size
        String[] names = new String[n];
        
      
        for (int i = 0; i < n; i++) {
            System.out.print("Enter name " + (i + 1) + ": ");
            names[i] = scanner.nextLine();
        }
        
        // Call the method that handles the exception
        handleException(names);
        
       
    }
}
