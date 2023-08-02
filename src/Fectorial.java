import java.util.*;
public class Fectorial
{
    public static void main(String[] args)
    {
        Scanner ob=new Scanner(System.in);
        int n,i,sum=1, fect=1;
        System.out.print( " Enter the value of N : ");
        n=ob.nextInt();
<<<<<<< HEAD
        //int fect=1;
=======
        int fect=1;
>>>>>>> b3456ee78c6974aa8efccfc6e786be02f49c7d4a
        for (i = 1; i <= n; i++)
        {
            fect=fect*i;
        }
        System.out.println(" fectorial = " + fect);

    }
}
