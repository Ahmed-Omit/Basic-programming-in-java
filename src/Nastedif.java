import java.util.*;
public class Nastedif {
    public  static void main( String [] args)
    {
        Scanner s=new Scanner(System.in);
        int a,b,c,d
                ;
        System.out.print( " Enter the value of a : ");
        a=s.nextInt();
        System.out.print( " Enter the value of b : ");
        b=s.nextInt();
        System.out.print( " Enter the value of c : ");
        c=s.nextInt();

        if( a>b && a>c)
        {
            d=a;
            //System.out.println(  "  a is the largest number are booth number " + a );
        }
        else if (b>c &&b>c)
        {
            d=b;
            //System.out.println( " b  is the largest number are booth number " + b );
        }
        else
        {
            d=c;
            //System.out.println("c is the largest number are booth number " +c);
        }
        System.out.println(" Largest number is : " + d);
    }
}
