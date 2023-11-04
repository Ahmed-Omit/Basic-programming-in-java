

// SINGLE INHERITANCE

class A
{
    int x=50;


}
class B extends A
{
    int y=30;
    void add()

        {
            y=x+y;
            System.out.println("  output of sub class : " + y);
        }

}

    public class Singleinheritance
    {
        public static void main(String[] args)
        {


            B ob1=new B();
            ob1.add();
        }
    }
