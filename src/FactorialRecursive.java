import java.util.*;
public class FactorialRecursive
{
    public static int fact(int n)
    {
        if (n == 0 || n == 1)
        {
            return 1;
        }
        else
        {
            return n * fact(n - 1);
        }
    }

    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        int number,result;
        System.out.print(" Enter the number  : ");
        number =s.nextInt();
         result = fact(number);
        System.out.println("Factorial of " + number + " is: " + result);
    }
}


