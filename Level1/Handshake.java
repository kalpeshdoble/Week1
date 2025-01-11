import java.util.Scanner;

public class Handshake {
  public int numberOfHandshake(int n) {
    int numberOfHandshake = (n * (n - 1)) / 2;
    return numberOfHandshake;

  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    // Taking number of student as a input

    int n = sc.nextInt();
    // create the object of class Handshake
    Handshake obj = new Handshake();
    // call the numberOfHandshake method
    System.out.println("The number of handshake of student " + n + " is " + obj.numberOfHandshake(n));
  }
}
