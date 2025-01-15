import java.util.*;
public class SubstringOccurrences
{
public static int  CheckSubstringOccurrences(String input,String subString){
int count=0;
int index=0;
for(int i=0;i<input.length();i++){
if(input.indexOf(subString,index)==-1){
break;
}
else{
count++;
index=input.subString(subString,index)+subString.length();
}
}
return count;
}
 

public static void main(String[]args){
 Scanner scanner = new Scanner(System.in);
        
        // Take user input for the text
        System.out.print("Enter string : ");
        String input = scanner.nextLine();
 String subString = scanner.nextLine();
          int result=CheckSubstringOccurrences(input,subString);
}
}

