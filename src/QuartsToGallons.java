public class QuartsToGallons
{
    public static void main (String[] args)
    {
        final int NUMOFQUARTSINAGALLON = 4;
        int numOfQuartsForPaintJob = 18;
        int gallons = numOfQuartsForPaintJob / NUMOFQUARTSINAGALLON;
        int remainingQuarts = numOfQuartsForPaintJob % NUMOFQUARTSINAGALLON;
        System.out.println("A job that needs " + numOfQuartsForPaintJob + " quarts requires "
                + gallons + " gallons " + remainingQuarts + " quarts");
    }
}
