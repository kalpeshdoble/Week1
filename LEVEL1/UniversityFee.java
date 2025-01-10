public class UniversityFee {
    public static void main(String[] main) {
        int fee = 125000, discountPercent = 10;
        int discountAmount = (fee / 1000) * 100;
        int discountedFee = fee - discountAmount;
        System.out.println("The discount amount is " + discountAmount + " and final discounted fee " + discountedFee);
    }
}