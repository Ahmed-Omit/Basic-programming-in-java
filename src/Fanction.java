class v
{
    void add(int x,int a)
    {
        x=x+a;
        System.out.println(" Summation =" + x);

    }
    void  add(double y,double z)
    {
        y=y+z;
        System.out.println(" Sum = " + y);
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
