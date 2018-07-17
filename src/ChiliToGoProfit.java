import java.util.*;
public class ChiliToGoProfit {
    public static void main(String[] args) {
        final double ADULTMEALPROFIT = 7 - 4.35;
        final double CHILDMEALPROFIT = 4 - 3.10;
        int numOfAdultMeal;
        int numOfChildMeal;

        Scanner input = new Scanner(System.in);
        System.out.println("Enter number of adult meals: ");
        numOfAdultMeal = input.nextInt();

        System.out.println("Enter number of children meals: ");
        numOfChildMeal = input.nextInt();

        double profitOfAdultMeal = numOfAdultMeal * ADULTMEALPROFIT;
        double profitOfChildMeal = numOfChildMeal * CHILDMEALPROFIT;
        int totalNumOfMeals = numOfAdultMeal + numOfChildMeal;
        double totalProfit = profitOfAdultMeal + profitOfChildMeal;
        System.out.println(numOfAdultMeal + " adult meals gives a profit of $" +
                String.format("%.2f",profitOfAdultMeal) + " and " + numOfChildMeal +
                " gives a profit of $" + String.format("%.2f",profitOfChildMeal) +
                ". The total profit for all " + totalNumOfMeals + " meals is $"
                + String.format("%.2f",totalProfit));
    }
}