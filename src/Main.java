class People2
{
    public String name;
    public int age;
    public String type;
    People2(String name, int age, String type)
    {
        this.name = name;
        this.age = age;
        this. type = type;
    }
    // Class, Constructor
    People2()
    {
        name = "Jhon doe";
        age = 40;
        type ="Normal";// Overloading
    }
    People2(People2 people2)
    {
        this.name = people2.name;
        this.age = people2.age;
        this. type = people2.type;// Copy Constructor
    }

}
public class Main
{
    public static void main(String[] args)
    {
        People2 object= new People2("Shihab", 20, "Programmer");
        System.out.println(object.name);
        System.out.println(object.age);
        System.out.println(object.type);
        // Class, Constructor
        People2 s = new People2();
        System.out.println(s.name);
        System.out.println(s.age);
        System.out.println(s.type);
        // Overloading
        People2 h = new People2(s);
        System.out.println(h.name);
        System.out.println(h.age);
        System.out.println(h.type);
        // Copy Constructor

    }
}

