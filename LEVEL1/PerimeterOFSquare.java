import java.util.*;

public class PerimeterOFSquare {
    public static void main(String[] args) {

          Scanner input = new Scanner(System.in);

          System.out.println("Enter Perimeter of Square");
          int perimeter = input.nextInt();

          int side = perimeter / 4;
     //print the result
          System.out.println("The side of square is " + side + " whose perimeter is " + perimeter);

    }
}

