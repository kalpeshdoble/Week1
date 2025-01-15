import java.util.*;
public class Reverse{
public static void main(String[]args){
 Scanner scanner = new Scanner(System.in);
        
        // Take user input for the text
        System.out.print("Enter string : ");
        String input = scanner.nextLine();
String newString="";

for(int i=input.length()-1;i>=0;i--){
newString=newString+input.charAt(i);
}
 System.out.println(newString);
}
}

