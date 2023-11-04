import java.util.*;
public class input
{
    public static void main(String[] args)
    {
        Scanner object=new Scanner(System.in);
        int n,i,c=0;
        System.out.print(" Enter the value : ");
        n=object.nextInt();
        for(i=1;i<=n;i++)
        {
            if(n%i==0)
            {
                c=c+1;
            }
        }
        if(c==2)
        {
            System.out.print("This number is prim ");
        }
        else
            System.out.println("This number is prim ");
    }
}
