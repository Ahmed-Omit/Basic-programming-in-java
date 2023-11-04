 class People5 {
    public String name;
    public int age;
    public String type;

    People5(String name, int age, String type)
    {
        this.name = name;
        this.age = age;
        this.type = type;

    }
}

public class People
{
    public static void main(String[]args)
    {
        People5 object = new People5("omit", 20,"Programmer");
        System.out.println(object.name);
        System.out.println(object.age);
        System.out.println(object.type);

    }

}




