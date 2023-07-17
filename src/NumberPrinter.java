import java.util.*;
public  class NumberPrinter
{
    public static void main( String arg[])
    {
        Scanner ob=new Scanner(System.in);
        int n,i;
        System.out.print(" Enter the value of n :");
        n=ob.nextInt();
        for(i=1;i<=n;i++)
        {
            if(i==50)
            //if(i%5==0)
           // if(i%5==1)

            {
               break;
                //continue;

            }
            System.out.println(i);
        }
    }


}