import java.util.*;
public class Array1
{
    public static void main(String[] args)
    {
        Scanner s= new Scanner(System.in);

        int n;
        System.out.print(" Enter the range : ");
        n=s.nextInt();

        int student []=new  int[n];

        for ( int i=0;i< n;i++)
        {
            System.out.print(" Enter the valur : ");
              student[i]= s.nextInt();

        }
        Arrays.sort(student);

        System.out.println( " Smaller number = " +  student[0] + " \n Largest number = " + student[n-1] );
        
    }

}
