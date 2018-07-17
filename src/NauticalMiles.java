public class NauticalMiles
{
    public static void main (String[] args)
    {
        final double NUMOFKM = 1.852, NUMOFMILES = 1.150779;
        int nauticalMiles = 10;
        System.out.println(nauticalMiles + " Nautical Miles equals to " + nauticalMiles * NUMOFKM + " Kilometers ");
        System.out.println(nauticalMiles + " Nautical Miles equals to " + String.format("%.3f",nauticalMiles * NUMOFMILES)
                + " Miles");

    }
}
