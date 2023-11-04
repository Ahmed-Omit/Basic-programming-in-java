import java.util.Scanner;

public class Endoffile
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String op;
        for(int i =1; sc.hasNext(); i++)
        {
            op = sc.nextLine();
            System.out.println(i+" "+op);
        }


    }
}
