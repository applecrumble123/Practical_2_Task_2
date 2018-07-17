import java.util.*;
public class MinutesConversion
{
    public static void main (String[] args)
    {
        double minutes;
        double hours;
        double days;

        Scanner input = new Scanner (System.in);
        System.out.println("Enter Minutes: ");
        minutes = input.nextInt();

        hours = minutes / 60;
        days = minutes / 24 / 60;

        System.out.println(minutes + " minutes is equals to " + hours + " hours and is also equals to " +
                String.format("%.3f",days) + " days." );
    }
}
