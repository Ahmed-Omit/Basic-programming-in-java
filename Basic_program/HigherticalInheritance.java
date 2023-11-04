class V1 {
    int m = 10;
    int l = 10;
}

class V2 extends V1
{

    void sum()
    {
        m=m+l;
        System.out.println(m);

    }
}

class V3 extends V1 {
    int y = 10;
}

class V4 extends V3 {
    int x = 10;
}

class V5 extends V4 {
    int c = 10;
}

class V6 extends V5 {
    void op() {
        int sum = m +  y + x + c+l;
        System.out.println("Sum: " + sum);
    }
}

public class HigherticalInheritance {
    public static void main(String[] args)
    {
        V2 object1 = new V2(); // creating object.
        object1.sum(); // call function.

        V6 object = new V6(); // creating object.
        object.op(); // call function.
    }
}
