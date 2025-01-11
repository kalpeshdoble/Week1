import java.util.Scanner;

public class QuotientAndRemainder {

    
    public static int[] findRemainderAndQuotient(int number, int divisor) {
        int[] result = new int[2];
        result[0] = number / divisor; 
        result[1] = number % divisor;  
        return result;
    }

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        //Taking user input
        System.out.print("Enter the dividend number ");
        int number = scanner.nextInt();

        System.out.print("Enter the divisor: ");
        int divisor = scanner.nextInt();

        
       
            // Call the method to find the quotient and remainder
            int[] result = findRemainderAndQuotient(number, divisor);
            
            // Display the quotient and remainder
            System.out.println("Quotient " + result[0]);
            System.out.println("Remainder " + result[1]);
        
    }
}
