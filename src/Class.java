class  man
{
    public String name;
    public int age;
    public String type;
     public man( String name,int age,String type)
     {
         this.name=name;
         this.age=age;
         this.type=type;
     }
    public man()
    {
        name = "Jhon doe";
        age = 40;
        type ="Normal";// Overloading
    }
    public man( man man)
    {
        this.name=man.name;
        this.age=man.age;
        this.type=man.type;
    }
}
public class Class
{
    public static void  main( String []arg)
    {
        man man=new man("omit" ,20 ," Student");
        System.out.println(man.name);
        System.out.println(man.age);
        System.out.println(man.type);

        man man1 = new man();
        System.out.println(man1.name);
        System.out.println(man1.age);
        System.out.println(man1.type);

        man man2 = new man(man1);
        System.out.println(man2.name);
        System.out.println(man2.age);
        System.out.println(man2.type);
    }
}
