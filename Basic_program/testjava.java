import java.util.*;
class testjava
 {
    public  static void main ( String [] args)
    {
        Scanner s=new Scanner( System.in);
        float a,b,sum;
        System.out.print(" Enter the value of a :");
        a=s.nextFloat();
        System.out.print(" Enter the value of b :");
        b=s.nextFloat();
        if( a>0||b>0)
        {
            System.out.print(" Summation is not possible");
        }
        else
        {
            sum=a+b;
            System.out.print(" Summation is " + sum);
        }

    }

}
