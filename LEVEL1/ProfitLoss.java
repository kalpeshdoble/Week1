public class ProfitLoss {
    public static void main(String[] args) {
        int CostPrice = 129, SellingPrice = 191;
        double Profit = SellingPrice - CostPrice;
        double ProfitPercentage = (Profit / CostPrice) * 100;

//print result
        System.out.println("The CostPrice is INR " + CostPrice + " SellingPrice is INR " + SellingPrice);
        System.out.println("The Profit is INR " + Profit + " and the Profit Percentage is " + ProfitPercentage);
    }
}