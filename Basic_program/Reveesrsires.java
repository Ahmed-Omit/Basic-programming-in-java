import java.util.*;
public class Reveesrsires
{
    public static void  main( String[]args)
    {
        Scanner s=new Scanner(System.in);
        int i,n=10,sum=0;
        //System.out.print(" Enter the range of n :");
        //n=s.nextInt();
        //System.out.print(" The reverse sires is : ");
        //while (i>=1)
        System.out.print(" The reverse sires is : "  );
        for(i=n;i>0;i--)
            //System.out.print(" The reverse sires is : "  );
        {
            System.out.print(" " +  i);
            sum=sum+i;

            //if (i == 1) {
               // break;
            //}
            //System.out.print(", ");
            //i--;
        }
        System.out.println(" \n Summation of  the reverse sires is : " + sum  );
    }
}
