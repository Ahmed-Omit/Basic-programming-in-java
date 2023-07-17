import java.util.*;
public class Largestnumber
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        int a,b,c,largest;
        System.out.print(" Enter the value of a : ");
        a= s.nextInt();
        System.out.print(" Enter the value of b : ");
        b= s.nextInt();
        System.out.print(" Enter the value of c : ");
        c= s.nextInt();

        largest=a;
        if(b>largest)
        {
            largest=b;
        }
        else if(c>largest)
        {
            largest=c;
        }
        System.out.println(" The largest number is : " + largest);

    }
}
