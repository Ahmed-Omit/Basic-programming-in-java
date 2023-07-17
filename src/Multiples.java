import java.util.*;
public class Multiples
{
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        int n,result;
        System.out.print(" Enter the value of n : ");
        n=s.nextInt();
        for(int i=1;i<=10;i++)
        {
             result=n*i;
            System.out.println(n+" * " + i +" = " + result);
        }

    }
}

