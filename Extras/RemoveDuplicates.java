import java.util.*;

public class RemoveDuplicates {

   
    public static String removeDuplicates(String input) {
       
        String result = "";
        
        
        String str= "";

        
        for (int i = 0; i < input.length(); i++) {
            char currentChar = input.charAt(i);
            
           
            if (str.indexOf(currentChar) == -1) {  
                str += currentChar;  
                result=result+currentChar; 
            }
        
        }
        return result;  
    }

    public static void main(String[] args) {
        
       Scanner scanner = new Scanner(System.in);
    System.out.println("Enter a String : ");
    String str = scanner.next();

        
       
        String outputString = removeDuplicates(str);
        
        
        System.out.println("Original String: " + str);
        System.out.println("String after removing duplicates: " + outputString);
    }
}
