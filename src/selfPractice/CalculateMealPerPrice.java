package selfPractice;

public class CalculateMealPerPrice {
    public static double calculateTotalMealPrice(double listedMealPrice,
                                               double tipRate,
                                               double taxRate) {
        double tip = tipRate * listedMealPrice;
        double tax = taxRate * listedMealPrice;
        double result = listedMealPrice + tip + tax;
        return result;
    }
    public static void main(String[] args) {
        double groupTotalMealPrice = calculateTotalMealPrice(100, .2, 0.8);
        System.out.println(groupTotalMealPrice);

        double individualMealPrice = groupTotalMealPrice / 5;
        System.out.println(individualMealPrice);

    }
}
