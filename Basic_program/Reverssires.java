import java.util.*;
public class Reverssires
{
    public static void main(String arg[])
    {
        Scanner s=new Scanner( System.in);
        int i,n;
        System.out.print(" Enter the value of n : ");
        n=s.nextInt();
        for( i=n;i>=0;i-=1)
        {
            if( i==10||i==20||i==30||i==40)
            {
                continue;

            }
            System.out.println(i);
        }
    }

}
