import java.util.Scanner;

import java.util.*;
    public class Fib
    {
        public static void main(String[]args)
        {
            Scanner s = new Scanner( System.in);
            //Scanner s = new Scanner(System.in);
            int a = 0, b = 1, c=0, n=1 ,sum=0,i,j=0;
            System.out.print(" enter the reange n = ");
            n = s.nextInt();
            for(  i=0;i<=n;i++)

            {
                System.out.println( a +" " );
                c=a+b;
                sum = sum + a;
                a=b;
                b=c;
            }
            System.out.println(" Summation = " + sum);
        }

    }

