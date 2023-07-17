import  java.util.*;
public class Evensires
{
    public static void main( String[]arg)
    {
        Scanner s=new Scanner( System.in);
        int n,i;
        System.out.print("Enter the value of n :");
        n=s.nextInt();
        for(i=0;i<=n;i=i+2)//(for(i=0;i<=n;i=i+2)-odd)
        {
            System.out.println("Even sires is : " + i);
        }
        //System.out.println("Even sires is : " + i);
    }
}
