abstract class Peoplex { // Abstract Class
    public String name;
    public static int age;

    public void printName() {
        System.out.println(name);
    }
    public abstract void printAge(int age);
}

// Pure Abstract Class
abstract class Peoplex2 { // Abstract Class
    public static int age;
    public abstract void printAge(int age);
}

interface Peoplex3 {
    int age = 0;
    void printAge(int age);
}

class PeopleDemo implements Peoplex3 {
    //@Override
    public void printAge(int age) {
        System.out.println(age);
    }
}

class PeopleDemo2 implements Peoplex3 {
    @Override
    public void printAge(int age) {
        System.out.println(age + 1);
    }
}

public class InterfaceDemo {
    public static void doPrint(Peoplex3 px, int age) {
        px.printAge(age);
    }
    public static void main(String[] args) {
        Peoplex3 p = new PeopleDemo();
        Peoplex3 p2 = new PeopleDemo2();

        doPrint(p, 25); //
        doPrint(p2, 25); //
    }
}
