import java.util.Scanner;

public class BirthDate
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        int year =
                SafeInput.getRangedInt(in,"Enter birth year",1950,2015);

        int month =
                SafeInput.getRangedInt(in,"Enter birth month",1,12);

        int maxDays;

        switch(month)
        {
            case 4,6,9,11:
                maxDays = 30;
                break;

            case 2:
                maxDays = 29;
                break;

            default:
                maxDays = 31;
        }

        int day =
                SafeInput.getRangedInt(in,"Enter birth day",1,maxDays);

        System.out.println("\nBirth Date: "
                + month + "/" + day + "/" + year);
    }
}