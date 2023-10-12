import java.util.Scanner;
import java.math.BigInteger;

public class numbersofdigit {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a 100-digit number: ");
        String input = scanner.nextLine();

        // Check if the input is a valid 100-digit number
        if (input.length() == 100 && input.matches("[0-9]+"))
        {
            BigInteger bigIntNumber = new BigInteger(input);

            // Check if the number is even or odd
            if (bigIntNumber.mod(BigInteger.valueOf(2)).equals(BigInteger.ZERO))
            {
                System.out.println("The number is even.");
            }
            else
            {
                System.out.println("The number is odd.");
            }
        }
        else
        {
            System.out.println("Invalid input. Please enter a 100-digit number.");
        }

        scanner.close();
    }
}
