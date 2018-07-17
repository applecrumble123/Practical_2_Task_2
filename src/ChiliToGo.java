import java.util.*;
public class ChiliToGo
{
    public static void main (String[] args)
    {
        final int ADULTMEAL = 7;
        final int CHILDMEAL = 4;
        int numOfAdultMeal;
        int numOfChildMeal;

        Scanner input = new Scanner (System.in);
        System.out.println("Enter number of adult meals: ");
        numOfAdultMeal = input.nextInt();

        System.out.println("Enter number of children meals: ");
        numOfChildMeal = input.nextInt();

        int costOfAdultMeal = numOfAdultMeal * ADULTMEAL;
        int costOfChildMeal = numOfChildMeal * CHILDMEAL;
        int totalNumOfMeals = numOfAdultMeal + numOfChildMeal;
        int totalCost = costOfAdultMeal + costOfChildMeal;
        System.out.println(numOfAdultMeal + " adult meals cost $" + costOfAdultMeal + " and " + numOfChildMeal +
        " child meals cost $" + costOfChildMeal + ". The total cost for all " + totalNumOfMeals + " meals cost $"
        + totalCost);



    }
}
