import java.util.*;
public class Sir_question
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);

        int n,sum=0;
        System.out.print(" Enter thr number : ");
        n=s.nextInt();

        for(int i=1;i<=n;i++)
        {
           if(n%i==0)
           {
               System.out.print(" " + i);
               sum +=i;
           }
        }
        System.out.println(" = "+ sum);

    }
}
