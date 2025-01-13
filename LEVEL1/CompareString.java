import java.util.*;
class CompareString{
public static boolean CompareUsingCharAt(String str1,String str2){
for(int i=0;i<str1.length();i++){
if(str1.charAt(i)!=str2.charAt(i)){
return false;
}
}
return true;
}
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
System.out.println("Enter two String : ");
String str1=sc.next();
String str2=sc.next();
System.out.println(CompareUsingCharAt(str1,str2));
boolean equal=str1.equals(str2);
System.out.println(equal);
}
}

