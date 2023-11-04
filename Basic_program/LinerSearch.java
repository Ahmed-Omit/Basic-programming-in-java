import java.util.*;
public class LinerSearch
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);

        int n,input,j;
        System.out.print(" Enter the number of element : ");
        n=s.nextInt();
        int array[] =new int[n];
        for(int i = 0;i<array.length;i++)
        {
            System.out.print(" Enter the element : ");
            array[i] = s.nextInt();
        }
        System.out.print(" find element : ");
        input=s.nextInt();
        boolean isFound = false;
        for( j=0;j<array.length;j++)
        {
            if(array[j]==input)
            {
                System.out.print("Element item found at " + j);
                isFound = true;
            }
        }
        if (!isFound)
        {
            System.out.print(" Element item not found ");
        }

    }
}
