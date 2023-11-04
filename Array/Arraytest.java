import java.util.*;

import java.util.*;
public class Arraytest
{
    public static void main(String[] args)
    {
        Scanner s =new Scanner(System.in);
        int sum =0;
        System.out.print(" Enter the number of element : ");
        int n=s.nextInt();
        int fpi[]=new int[n];

        for(int i=0;i<n;i++)
        {
            System.out.print(" Enter the  element : ");
            fpi[i] =s.nextInt();
            sum = sum + fpi[i];
        }

        int average =sum/n;


        int max=fpi[0];
        int min=fpi[0];
        for (int i = 0;i<n;i++)
        {
            if(max < fpi[i])
            {
                max =fpi[i];
            }

            if(min > fpi[i])
            {
                min =fpi[i];
            }
        }
        System.out.println(" summation : " + sum);
        System.out.println( " average : " + average);
        System.out.println(" max number : " +  max);
        System.out.println(" min number : " +  min);
    }
}

