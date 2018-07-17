public class InchesToFeet
{
    public static void main (String[] args)
    {
        int inches = 86;
        final int feet = 12;
        int inchesToFeet = inches / feet;
        int remainingInches = inches % feet;
        System.out.println(inches + " inches is " + inchesToFeet + " feet and " + remainingInches + " inches.");



    }
}
