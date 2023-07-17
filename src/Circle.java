import java.util.*;

public class Circle {
    public static void main(String[] args)
    {
        double area,r;
        Scanner s = new Scanner(System.in);
        System.out.print( " Enter  the value of r : ");
        r =s.nextDouble();
        area = Math.PI * r * r;
        System.out.println("Area of  circle is " + area);
    }
}
