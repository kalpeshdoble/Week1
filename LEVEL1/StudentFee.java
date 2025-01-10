import java.util.Scanner;

public class StudentFee {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int fee = sc.nextInt();
        int discountPercent = sc.nextInt();
        int discountAmount = (fee / 100) * discountPercent;
        int discountedFee = fee - discountAmount;
        System.out.println("The discount amount is " + discountAmount + " and final discounted fee " + discountedFee);
    }
}