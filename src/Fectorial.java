import java.util.*;
public class Fectorial
{
    public static void main(String[] args)
    {
        Scanner ob=new Scanner(System.in);
        int n,i,sum=1;
        System.out.print( " Enter the value of N : ");
        n=ob.nextInt();
        if(0<=n)
        {
            for (i = 1; i <= n; i++)
            {
                sum = sum * i;
            }
            System.out.println(" Summation = " + sum);
        }
        else
            System.out.println(" Fectorial is not possible");

    }
}
