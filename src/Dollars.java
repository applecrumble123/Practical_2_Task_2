import java.util.*;
public class Dollars
{
    public static void main (String[] args)
    {

        int dollars;

        Scanner input = new Scanner (System.in);
        System.out.println("Enter dollars only: ");
        dollars = input.nextInt();
        int numOfTwenty = dollars / 20;
        int numOfTen =  (dollars - (20*numOfTwenty)) / 10;
        int numOfFive = (dollars - (10*numOfTen + 20*numOfTwenty)) / 5;
        int numOfOne = (dollars - (10*numOfTen + 20*numOfTwenty + 5*numOfFive));

        System.out.println("That is " + numOfTwenty + " notes of $20, " + numOfTen + " notes of $10, " + numOfFive +
        " notes of $5 and " + numOfOne + " coins of $1.");



    }
}
