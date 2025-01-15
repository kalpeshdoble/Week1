import java.util.Scanner;

public class ShortestAndLongestString {

    // Method to split the text into words without using the String split() method
    public static String[] splitTextIntoWords(String text) {
        int wordCount = 0;
        StringBuilder currentWord = new StringBuilder();

        // Count words
        for (int i = 0; i < text.length(); i++) {
            if (Character.isWhitespace(text.charAt(i)) || i == text.length() - 1) {
                if (currentWord.length() > 0) {
                    wordCount++;
                    currentWord.setLength(0); // Reset current word
                }
            } else {
                currentWord.append(text.charAt(i));
            }
        }

        // Array to store words
        String[] words = new String[wordCount];
        int wordIndex = 0;
        currentWord.setLength(0); // Reset the StringBuilder

        // Fill the words array
        for (int i = 0; i < text.length(); i++) {
            if (Character.isWhitespace(text.charAt(i)) || i == text.length() - 1) {
                if (currentWord.length() > 0) {
                    words[wordIndex++] = currentWord.toString();
                    currentWord.setLength(0); // Reset current word
                }
            } else {
                currentWord.append(text.charAt(i));
            }
        }
        return words;
    }

    // Method to find the length of a word without using the length() method
    public static String findStringLength(String word) {
        int count = 0;
        try {
            // Count characters until an exception occurs
            while (true) {
                word.charAt(count);  // This will throw an exception when count exceeds the word length
                count++;
            }
        } catch (StringIndexOutOfBoundsException e) {
            return String.valueOf(count);  // Return length as String
        }
    }

    // Method to create a 2D array of words and their lengths
    public static String[][] getWordsWithLengths(String[] words) {
        String[][] result = new String[words.length][2];
        for (int i = 0; i < words.length; i++) {
            result[i][0] = words[i]; // The word itself
            result[i][1] = findStringLength(words[i]); // The length of the word
        }
        return result;
    }

    // Method to find the shortest and longest words
    public static int[] findShortestAndLongest(String[][] wordsWithLengths) {
        int shortestIndex = 0;
        int longestIndex = 0;

        for (int i = 1; i < wordsWithLengths.length; i++) {
            int currentLength = Integer.parseInt(wordsWithLengths[i][1]);

            // Find the shortest word
            if (currentLength < Integer.parseInt(wordsWithLengths[shortestIndex][1])) {
                shortestIndex = i;
            }

            // Find the longest word
            if (currentLength > Integer.parseInt(wordsWithLengths[longestIndex][1])) {
                longestIndex = i;
            }
        }

        return new int[] { shortestIndex, longestIndex };
    }

    // Main method
    public static void main(String[] args) {
        // Creating a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Taking input text from the user
        System.out.print("Enter a string: ");
        String inputText = scanner.nextLine();

        // Split the input text into words
        String[] words = splitTextIntoWords(inputText);

        // Get 2D array of words and their lengths
        String[][] wordsWithLengths = getWordsWithLengths(words);

        // Find the shortest and longest words
        int[] shortestAndLongest = findShortestAndLongest(wordsWithLengths);

        // Display the result
        System.out.println("\nShortest word: " + wordsWithLengths[shortestAndLongest[0]][0]);
        System.out.println("Longest word: " + wordsWithLengths[shortestAndLongest[1]][0]);
    }
}
