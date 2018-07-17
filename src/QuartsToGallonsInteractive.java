import java.util.Scanner;
public class QuartsToGallonsInteractive
{
    public static void main (String[] args)
    {
        final int NUMOFQUARTSINGALLONS = 4;
        int numOfQuarts;
        int remainingQuarts;
        int gallons;
        Scanner input = new Scanner (System.in);
        System.out.print("Enter number of quarts in a gallon: ");
        numOfQuarts = input.nextInt();
        gallons = numOfQuarts / NUMOFQUARTSINGALLONS;
        remainingQuarts = numOfQuarts % NUMOFQUARTSINGALLONS;
        System.out.println(numOfQuarts + " quarts are needed for " + gallons +
                " gallons " + remainingQuarts + " quarts.");

    }
}
