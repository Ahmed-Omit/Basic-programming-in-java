import java.util.*;
public class sum {
    public static void main(String[]args)
    {
        Scanner s = new Scanner(System.in);
        int x,y,sum;
        System.out.print(" Enter the value of x : ");
        x=s.nextInt();
        System.out.print(" Enter the value of y : ");
        y=s.nextInt();
        if( x>0 && y>0 && x>y)
        {
           sum=x+y;
           y=x-y;
            System.out.println(" Summation = " + sum );
            System.out.println(y);
        }
        else
            System.out.print(" The sum  is not possible");
    }
}
