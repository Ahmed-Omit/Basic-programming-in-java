import java.util.*;
public class fpi
{
    public static  void  main( String arg[])
    {
        Scanner f=new Scanner(System.in);
        float N,sum=0,i;
        System.out.print(" Enter the value of N : ");
        N=f.nextFloat();
        for(i=1;i<=N;i++)
        {
            sum=sum+1/(i*(i));

        }
        System.out.println("sum = " + sum);


    }

}




