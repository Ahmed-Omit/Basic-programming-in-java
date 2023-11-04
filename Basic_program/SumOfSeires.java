import java.util.*;
public class SumOfSeires
{
    public static void main(String []args)
    {
        Scanner s=new Scanner(System.in);
        int n,i,sum = 0,c=0;
        System.out.print(" Enter the range of n: ");
        n=s.nextInt();
        for(i=1;i<=n;i+=2)
            //for(i=0;i<=n;i++) normal number sum1+2+3+4+5++++n
            {
                System.out.println(i );
              sum+=i;
                //System.out.println(" The summation of sires is : " + sum);
             //c+=1;
              // System.out.println(c);


            }
        System.out.println(" The summation of sires is : " + sum);



    }
}
