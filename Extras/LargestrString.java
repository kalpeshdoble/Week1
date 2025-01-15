import java.util.*;
public class LargestrString{
public static void main(String[]args){
 Scanner scanner = new Scanner(System.in);
        
        // Take user input for the text
        System.out.print("Enter string : ");
        String input = scanner.nextLine();
String String="";
               String newString="";
 int max=0;
          for(int i=0;i<input.length();i++){
                  
                
                 if(input.charAt(i)!=' '||input.charAt(i)==input.length()-1){
                    newString=newString+input.charAt(i);
           }
else{
if(max<newString.length()){
max= newString.length();
String=newString;
newString="";
}
else{
String=newString;
newString="";
}
}
}

 System.out.println(String);

}
}
                     
                      
