import java.util.Scanner;
public class InchesToFeetInteractive
{
    public static void main (String[] args)
    {
        int inches;
        final int feet = 12;
        Scanner input = new Scanner (System.in);
        System.out.println("Enter inches: ");
        inches = input.nextInt();
        int inchesToFeet = inches / feet;
        int remainingInches = inches % feet;
        System.out.println(inches + " inches is " + inchesToFeet + " feet and " + remainingInches + " inches.");

    }
}
