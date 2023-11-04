import java.util.*;
public class BinarySearch
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        System.out.print(" Enter the value of n : ");
        int n=s.nextInt();
        int Array[]= new int[n];

        for(int i=0;i<Array.length;i++)
        {
            System.out.print(" Enter the " + i + " index value : ");
            Array[i]=s.nextInt();
        }
        System.out.print( " enter the target : ");
        int target = s.nextInt();
        Arrays.sort(Array);

//        for( int number : Array)
//      {
//           //System.out.println(" Arrays " + number);
//       }
        int left =0;
       int right =Array.length -1;
       boolean found = false;
        while (left <= right)
        {
            int mid =  (right + left) / 2;
            if (Array[mid] == target)
            {
                System.out.println("Element found at index " + mid);
                found = true;
                break;
            }
            if (Array[mid] < target)
            {
                left = mid + 1;
            }
            else
            {
                right = mid - 1;
            }
        }
        if (!found)
        {
            System.out.println("Element not found in the array");
        }
    }
}

