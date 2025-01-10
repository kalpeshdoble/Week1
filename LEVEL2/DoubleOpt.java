import java.util.Scanner;

public class DoubleOpt  {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Take the input
        double a = sc.nextDouble();
        double b =sc.nextDouble();
        double c = sc.nextDouble();

        double operation1 = a + (b * c);
        double operation2 = (a * b) + c;
        double operation3 = c + (a / b);
        double operation4 = (a % b) + c;

        // print the result
        System.out.println("The results of Int Operations are " + operation1 + "," + operation2 + "," + operation3
                + " and " + operation4);
    }
}
