
class op
{
   op(int a,int b)
   {
       int add=a+b;
       System.out.print(" Summation (a+b) = "  + add );
   }

   op(double x,double y)
   {

       double sum=x+y;
       System.out.print(" Summation (a+b) = "  + sum );
   }
}
public class constractorOverloding
{
    public static void main(String[] args)
    {
        op object = new op(20,30);
        op object1 = new op(10.11,20.454);
    }
}
