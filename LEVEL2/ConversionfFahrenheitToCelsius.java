import java.util.*;

public class ConversionFahrenheitToCelsius {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
// Take the input
    int fahrenheit = input.nextInt();

    int celsiusResult = (fahrenheit - 32) * 5 / 9;
   //print the output
    System.out.println("The " + fahrenheit + "  fahrenheit is " + celsiusResult + " celsius");
  }
}