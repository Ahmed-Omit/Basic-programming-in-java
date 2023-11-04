import java.util.*;
public class Task155
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);

        int num1;

        System.out.print(" Enter the value of num1 : ");
        num1 = s.nextInt();



        if(num1 % 2==0 && num1 % 5==0)
        {
            System.out.print( num1 + " is divisible by both 2 and 5 .");
        }
        else
            System.out.print( num1 + " is not  divisible by both 2 and 5 . ");
    }
}
