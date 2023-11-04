import java.util.Scanner;

public class Pramed
{
    public static void main(String[] args)
    {
        var s  = new Scanner(System.in);

        int n = s.nextInt();

        int i, j, m = n-1;

        for( i=1;i<=n;i += 2)
        {
            for (int k = 1; k <= m; k++) {
                System.out.print(" ");
            }
            m--;
            for(j=1;j<=i;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
