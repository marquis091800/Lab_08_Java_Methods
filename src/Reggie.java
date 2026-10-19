import java.util.Scanner;

public class Reggie
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        String ssn = SafeInput.getRegExString(
                in,
                "Enter a SSN",
                "^\\d{3}-\\d{2}-\\d{4}$");

        String mNumber = SafeInput.getRegExString(
                in,
                "Enter a UC M Number",
                "^(M|m)\\d{5}$");

        System.out.println("\nMenu");
        System.out.println("O - Open");
        System.out.println("S - Save");
        System.out.println("V - View");
        System.out.println("Q - Quit");

        String choice = SafeInput.getRegExString(
                in,
                "Enter a choice",
                "^[OoSsVvQq]$");

        System.out.println("\nSSN: " + ssn);
        System.out.println("M Number: " + mNumber);
        System.out.println("Choice: " + choice);
    }
}