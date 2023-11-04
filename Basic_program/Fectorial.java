import java.util.*;
public class Fectorial
{
    public static void main(String[] args)
    {
        Scanner ob=new Scanner(System.in);
        int n,i,sum=1, fect=1;
        System.out.print( " Enter the value of N : ");
        n=ob.nextInt();
        //int fect=1;

        int fect1=1;
        for (i = 1; i <= n; i++)
        {
            fect1=fect1*i;
        }
        System.out.println(" fectorial = " + fect1);

    }
}
