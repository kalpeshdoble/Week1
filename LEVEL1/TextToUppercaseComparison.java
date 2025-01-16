import java.util.Scanner;

public class TextToUppercaseComparison {

   
    public static String convertToUpperCaseCustom(String text) {
        StringBuilder upperText = new StringBuilder();
        
        for (int i = 0; i < text.length(); i++) {
            char currentChar = text.charAt(i);
            
            // Check if the character is lowercase and convert to uppercase using ASCII values
            if (currentChar >= 'a' && currentChar <= 'z') {
                char upperChar = (char) (currentChar - 32); // Convert to uppercase
                upperText.append(upperChar);
            } else {
                // If it's not lowercase, just append the character as it is
                upperText.append(currentChar);
            }
        }
        
        return upperText.toString();
    }

    // Method to compare two strings using charAt()
    public static boolean compareStrings(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false; // Strings of different lengths cannot be equal
        }
        
        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                return false; // If any character is different, return false
            }
        }
        
        return true; // If all characters match, return true
    }

    public static void main(String[] args) {
        // Create a scanner object for user input
        Scanner scanner = new Scanner(System.in);
        
        // Take user input for the text
        System.out.print("Enter some text: ");
        String inputText = scanner.nextLine();
        
        // Convert the text to uppercase using both methods
        String customUpperCaseText = convertToUpperCaseCustom(inputText);
        String builtInUpperCaseText = inputText.toUpperCase(); // Using built-in method
        
        // Display both results
        System.out.println("Custom Uppercase Conversion: " + customUpperCaseText);
        System.out.println("Built-in Uppercase Conversion: " + builtInUpperCaseText);
        
        // Compare the two uppercase strings using the user-defined method
        boolean areEqual = compareStrings(customUpperCaseText, builtInUpperCaseText);
        
        // Display the comparison result
        if (areEqual) {
            System.out.println("Both methods produce the same uppercase text.");
        } else {
            System.out.println("The methods produce different uppercase texts.");
        }
        
        // Close the scanner object to prevent resource leak
        scanner.close();
    }
}
