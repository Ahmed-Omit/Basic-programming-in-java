import java.util.*;
public class ProblemX
{
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        int n,i,c=0,sum=0,r,summation=0;
        System.out.print(" Enter the value of n: ");
        n= s.nextInt();
        if (0<n)
        {
            for (i = 1; i <= n; i++) {
                if (i % 3 == 0)
                {
                    System.out.print(" " + i);
                    sum = sum + i;
                }
                c = c + 1;
            }
            System.out.println("\nLoop count :" + c);
            System.out.println("Summation = " + sum);
            n = sum;
            {
                while (n != 0) {
                    r = n % 10;
                    System.out.print(r);
                    n = n / 10;
                    summation = summation + r;
                }

                System.out.print("\nSummation = " + summation);
            }



        }
        else
            System.out.println(" Its not possible");
    }



}

