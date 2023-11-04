import java.util.Scanner;

public class PrimeNumbers {
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        int  i, j, b,r,n=0;
        //System.out.print(" Enter the rang of n : ");
        //n = s.nextInt();
        for (i = 1; i <=10; i++) {
            b = 0;

            for (j = 1; j <= i; j++)
            {
                if (i % j == 0)
                {
                    b = b + 1;
                }
                n=i;
            }

            if (b == 2)
            {
                System.out.print(i);
            }


        }


    }
}
