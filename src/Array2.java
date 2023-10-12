import java.util.*;
public class Array2
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        System.out.print( " Enter the array of rage n: ");
        int n= s.nextInt();
        int number[] =new int[n];

        for(int i=0;i< number.length;i++)
        {
            System.out.print( " enter the " + i  + " index value :  ");
            number[i]=s.nextInt();
        }

        System.out.print("new array: ");


        for( int j=0;j<number.length;j++)
        {
            if (number[j] % 2 ==0)
            {
                continue;
            }

            else
                System.out.print( number[j] + "  ");


        }



    }
}
