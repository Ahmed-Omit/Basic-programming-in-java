import java.util.*;
public class ArrayTest5
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        int Summation=0;
        int[] n= new int[10];
        for(int i=1;i<=10;i++)
        {
            System.out.print(" Enter the " + i + "  value : ");
            n[i]=s.nextInt();
            Summation= Summation + n[i];
        }
        for (int S : n)
        {
            System.out.println(S);

        }
        System.out.println(" Summation = " + Summation);


    }
}
