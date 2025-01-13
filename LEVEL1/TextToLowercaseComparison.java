import java.util.Scanner;

public class TextToLowercaseComparison {

    // Method to convert text to lowercase using ASCII values and charAt() method
    public static String convertToLowerCaseCustom(String text) {
        StringBuilder lowerText = new StringBuilder();
        
        for (int i = 0; i < text.length(); i++) {
            char currentChar = text.charAt(i);
            
            // Check if the character is uppercase and convert to lowercase using ASCII values
            if (currentChar >= 'A' && currentChar <= 'Z') {
                char lowerChar = (char) (currentChar + 32); // Convert to lowercase
                lowerText.append(lowerChar);
            } else {
                // If it's not uppercase, just append the character as it is
                lowerText.append(currentChar);
            }
        }
        
        return lowerText.toString();
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
        
        // Convert the text to lowercase using both methods
        String customLowerCaseText = convertToLowerCaseCustom(inputText);
        String builtInLowerCaseText = inputText.toLowerCase(); // Using built-in method
        
        // Display both results
        System.out.println("Custom Lowercase Conversion: " + customLowerCaseText);
        System.out.println("Built-in Lowercase Conversion: " + builtInLowerCaseText);
        
        // Compare the two lowercase strings using the user-defined method
        boolean areEqual = compareStrings(customLowerCaseText, builtInLowerCaseText);
        
        // Display the comparison result
        if (areEqual) {
            System.out.println("Both methods produce the same lowercase text.");
        } else {
            System.out.println("The methods produce different lowercase texts.");
        }
        
        // Close the scanner object to prevent resource leak
        scanner.close();
    }
}
