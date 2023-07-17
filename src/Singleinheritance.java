class a
{

    int x=20;
}
class b extends a
{
    int y=10;
    void add()

        {
            x=x+y;
            System.out.print(" sum = " + x);
        }

}

//import java.util.*;

    public class Singleinheritance
    {
        public static void main(String[] args)
        {
        //Scanner s = new Scanner(System.in);
            b ob=new b();
            ob.add();
        }



    }
