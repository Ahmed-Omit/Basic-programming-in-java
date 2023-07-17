import java.util.*;
public class Statment
{
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        double a,b,c,D,x1,x2;
        System.out.print(" Enter the value of a : ");
        a=s.nextDouble();
        System.out.print(" Enter the value of b : ");
        b=s.nextDouble();
        System.out.print(" Enter the value of c : ");
        c=s.nextDouble();
        D=b*b-4*a*c;
        if( D>0)
        {
            x1=(-b+Math.sqrt(D))/2;
            x2=(-b-Math.sqrt(D))/2;
            System.out.print(" The root are " + x1+ " and " + x2);
        } else if (D==0)
        {
            x1=-b/(2*a);
            System.out.print(" The root is " + x1);
        }
        else
            System.out.print(" The root are not real");

    }
}
