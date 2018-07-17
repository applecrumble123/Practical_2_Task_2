import java.util.Scanner;
public class NauticalMilesInteractive
{
    public static void main (String[] args)
    {
        final double NUMOFKM = 1.852, NUMOFMILES = 1.150779;
        double nauticalMiles;
        Scanner input = new Scanner (System.in);
        System.out.print("Enter Nautical Miles: ");
        nauticalMiles = input.nextDouble();
        System.out.println(nauticalMiles + " Nautical Miles is equals to " + String.format("%.2f",
                nauticalMiles * NUMOFKM) + " Kilometers.");
        System.out.println(nauticalMiles + " Nautical Miles is equals to " + String.format("%.2f",
                nauticalMiles * NUMOFMILES) + " Miles");
    }
}
