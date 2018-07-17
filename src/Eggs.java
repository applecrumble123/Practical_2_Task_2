import java.util.*;
public class Eggs
{
    public static void main (String[] args)
    {
        int numOfEggs;
        int numOfDozen;
        int looseEggs;
        final double DOZENEGGS = 3.25;
        final double INDIVIDUALEGGS = 0.45;
        Scanner input = new Scanner (System.in);
        System.out.println("Enter number of eggs: ");
        numOfEggs = input.nextInt();
        numOfDozen = numOfEggs / 12;
        looseEggs = numOfEggs % 12;
        double totalCost = numOfDozen * DOZENEGGS + (looseEggs * INDIVIDUALEGGS);
        System.out.println("You have ordered " + numOfEggs + " eggs. That's " + numOfDozen + " dozen at " + "$"
        + DOZENEGGS + " per dozen and " + looseEggs + " loose eggs at " + "$" + INDIVIDUALEGGS + " each, for a total of "
        + "$" + totalCost);
    }
}
