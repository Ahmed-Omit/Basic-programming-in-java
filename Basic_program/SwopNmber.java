import java.util.*;
public class SwopNmber
{
    public static void main(String[] args)
    {
        Scanner s= new Scanner(System.in);
        int a,b;
        System.out.print(" Enter the value of a : ");
        a=s.nextInt();
        System.out.print(" Enter the value of b : ");
        b=s.nextInt();

        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println(" A : " + a);
        System.out.println(" B : " + b);
    }
}
