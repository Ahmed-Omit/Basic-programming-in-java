import java.util.*;
public class Degree
{
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        double degree,radian=0;
        System.out.print(" Enter the number of radian  : ");
        radian=s.nextDouble();


        degree= (radian*(180/3.1416));
        System.out.println("Degree = " + degree );
    }
}
