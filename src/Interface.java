interface n
{
    int X=10;
}
class k implements n
{
     public  void  add()
    {

        int y;
        y=X+5;
        System.out.println(" Summation =" + y);
    }
}
public class Interface
{
    public static void main(String[] args)
    {
        k ob= new k();
        ob.add();

    }
}
