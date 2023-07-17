import java.util.*;
public class Robin
{
    public static void  main( String[]arg)
    {
        Scanner s=new Scanner(System.in);
        int n,r,sum=0;
        System.out.print(" Enter the value of n: ");
        n=s.nextInt();
        //n=6790;
        if(0<n)
        {
            while (n != 0)
            {
                r = n % 10;
                System.out.print(r);
                n = n / 10;
                sum = sum + r;
            }

            System.out.print("\nSummation = " + sum);
        }
        else
            System.out.println(" Summation is not possible");
    }

}
