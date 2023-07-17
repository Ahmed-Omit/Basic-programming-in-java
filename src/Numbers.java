import java.util.*;

public class Numbers
{
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        double N,sum=0,i=0,summation;
        System.out.print(" Enter the value of N : ");
        N=s.nextInt();
        for(i=2;i<+N;i++)
        {
            sum=sum + Math.pow(i,i+1);

           // System.out.print(sum);
        }
        summation=Math.pow(sum,N);
        System.out.print(summation);
    }
}