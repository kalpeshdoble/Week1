import java.util.Scanner;

public class Handshake2 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
   //Taking number of student as a input
    int n = sc.nextInt();
    int numberOfHandshake = (n * (n - 1)) / 2;

    System.out.println("The number of handshake of student " + n + " is " + numberOfHandshake);
  }
}
