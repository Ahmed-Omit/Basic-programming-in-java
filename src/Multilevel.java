class e
{
    float x =20;

}
class f extends e

{
    float y=10;

}
class g extends f
{
    float z=7;
    void omit()
    {
        x=x+y+z;
        System.out.println("  posative sum = "+ x);

    }

}
class h extends g
{
    void sum()
    {
        y=x-y-z;
        System.out.println("  Negative sum = "+ y);


    }



}

public class Multilevel
{
    public static void main(String[] args)
    {
        g ob=new g();//Crate object
        h bo=new h();
        ob.omit();//Function call
        bo.sum();


    }
}
