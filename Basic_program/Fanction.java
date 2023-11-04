class v
{
    void add(int x,int a)
    {
         int sum =x+a;
        System.out.println(" Summation =" + sum);

    }
    void  add(double y,double z)
    {
        double sum=y+z;
        System.out.println(" Sum = " + sum);
    }
}
public class Fanction
{
    public static void main(String[] args)
    {
        v ob=new  v();
        ob.add(5,10);
        ob.add(10,200.00);
     }
}
