import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int integerArray[] = new int[10];
        int count = 1;
        for (int i = 0; i < 10; i++) {
            integerArray[i] = number * count;
            count++;
        }
        int count1 = 1;

        for (int i = 0; i < 10; i++) {
            System.out.println(number + "*" + count1 + " =" + integerArray[i]);
            count1++;
        }
    }
}