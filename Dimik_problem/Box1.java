/*public class Box1
{
    public static void main(String[] args)
    {

        for(int i=0;i<=5;i++)
        {
            for ( int j=0;j<=5;j++)
            {
                System.out.print(" *");
            }
            System.out.println();
        }

    }
}

 */

import java.util.Scanner;

public class Box1
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        int t = scanner.nextInt();
        while (t-- > 0)
        {
            int radius = scanner.nextInt();
            for (int i = 1; i <= radius; i++)
            {
                for (int j = 1; j <= radius; j++)
                {
                    System.out.print("*");
                }
                System.out.println();
            }
           if (t != 0)
            {
                System.out.println();
            }


        }

    }
}


