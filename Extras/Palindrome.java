import java.util.*;

public class Palindrome {
  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter a String : ");
    String str = scanner.next();
    int count = 0;
    int right = str.length() - 1;
    for (int i = 0; i < str.length(); i++) {
      if (str.charAt(i) == str.charAt(right)) {
        count++;
      }
      right--;
    }
    if (count == str.length()) {
      System.out.println("string are palindrome");
    } else {
      System.out.println("string are not palindrome");
    }
  }
}
