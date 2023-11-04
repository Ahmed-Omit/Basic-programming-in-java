import java.util.*;
public class Nastedif {
    public  static void main( String [] args)
    {
        Scanner s=new Scanner(System.in);
        int a,b,c,sum,summation;

        System.out.print( " Enter the value of a : ");
        a=s.nextInt();
        System.out.print( " Enter the value of b : ");
        b=s.nextInt();
       if( a>0 && b>0)
       {
           if(a%2==0 && b%2==0)
           {
               sum= a+b;
               System.out.print(sum);
           }
           else
           {
              sum=a-b;
               System.out.print(sum);
           }

       }
       else
           System.out.print(" Summation is nos possible");
    }
}
