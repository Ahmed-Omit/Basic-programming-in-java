import java.util.*;
public class DescendingOrderSort
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print(" Enter the  number of element  : ");
        int n=scanner.nextInt();
        int[] numbers = new int[n];

        for (int i = 0; i < numbers.length; i++)
        {
            System.out.print(" Enter the " + i + " index value : ");
            numbers[i] = scanner.nextInt();
        }

        for (int i = 0; i < numbers.length ; i++)
        {
            //int minIndex = i; ascendingOrder
            int maxIndex = i;
            for (int j = i + 1; j < numbers.length; j++)
            {
                //if (numbers[j] < numbers[,minIndex]) ascendingOrder
                if (numbers[j] > numbers[maxIndex])
                {
                    maxIndex = j;
                }
            }

            int temp = numbers[i];
            numbers[i] = numbers[maxIndex];
            numbers[maxIndex] = temp;
        }

        for( int array : numbers)

        {
            System.out.print( "DescendingOrder " + array + " ");
        }

    }
}

