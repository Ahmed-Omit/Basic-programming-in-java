import java.util.*;
public class fibseiress
{
    public static void main(String[]args)
    {
        Scanner s = new Scanner( System.in);
        //Scanner s = new Scanner(System.in);
        int a = 0, b = 1, c, n;
        System.out.print(" enter the reange n = ");
        n = s.nextInt();
        while (a<=n)
        //for( int i=1;i<=n;i++)

        {
            System.out.println( a +" " );
            c=a+b;
            a=b;
            b=c;
        }

    }
}