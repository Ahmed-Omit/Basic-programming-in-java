import java.util.Scanner;
public class Even_odd_1
{
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        int T,n,i;
        T=s.nextInt();
        for(i=1;i<=T;i++)
        { n=s.nextInt();

            if(n % 2==0)
            {
                System.out.println(" even");
            }
            else
            {
                System.out.println(" odd");
            }

        }


    }
}
