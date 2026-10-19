import java.util.Scanner;

public class GetUserName
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        String first =
                SafeInput.getNonZeroLenString(in,"Enter first name");

        String last =
                SafeInput.getNonZeroLenString(in,"Enter last name");

        String username =
                SafeInput.getNonZeroLenString(in,"Enter username");

        System.out.println("\nFirst Name: " + first);
        System.out.println("Last Name: " + last);
        System.out.println("Username: " + username);
    }
}