import java.util.*;
//import  java.lang.Math.*;
public class Trangel {
    public static  void main( String []args)
    {
        Scanner r=new Scanner(System.in);
        double a,b,c,s,Area;

        System.out.print(" Enter the value of a : ");
        a=r.nextDouble();
        System.out.print(" Enter the value of b : ");
        b=r.nextDouble();
        //Area= 0.5*Height*Base;
        //System.out.println(" Area of Triangle is " + Area);
        System.out.print(" Enter the value of c : ");
        c=r.nextDouble();
        if( a<b+c&&b<a+c&&c<a+b)
        {
           s= (a+b+c)/2;
           Area=Math.sqrt(s*(s-a)*(s-b)*(s-c));
           System.out.print(" Area of trangel is : " + Area);


        }
        else
            System.out.println(" Trangle is not possible");
    }

}
