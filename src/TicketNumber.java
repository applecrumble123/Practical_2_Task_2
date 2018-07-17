import java.util.*;
public class TicketNumber
{
    public static void main (String[] args)
    {
        int ticketNumber;
        int remainder;
        Scanner input = new Scanner (System.in);
        System.out.println("Enter 6-digits ticket number: ");
        ticketNumber = input.nextInt();

        String numberAsString = Integer.toString(ticketNumber);
        //Changing the integer into a string

        char lastNum = numberAsString.charAt(numberAsString.length()-1);
        // Getting the last character of the string

        remainder = (ticketNumber / 10) % 7;
        char lastChar = Integer.toString(remainder).charAt(0);
        //changing the remainder from an integer into a character so it can be compared to lastNum.


        if (lastNum == lastChar)
            {
                System.out.println("The last number is "+ lastNum + " and the remainder is "
                        + remainder + ". The ticket is true.");
            }
        else
            {
                System.out.println("The last number is "+ lastNum + " and the remainder is "
                    + remainder + ". The ticket is false.");
            }

    }
}
