import  java.util.*;
public class Problem179pag
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        System.out.print(" choose operator  + ,-,*,/  : ");
        char cr=s.next().charAt(0);

        System.out.print(" Enter number1 valur ");
        int number1=s.nextInt();
        System.out.print(" Enter number2 valur ");
        int number2=s.nextInt();
        int result = 0 ;

        switch(cr)
        {
            case  '+' ->  result =number1 + number2;


            case  '-' -> result =number1 - number2;


            case  '*' ->    result =number1 * number2;

            case  '/' -> result =number1 / number2;
            default ->
            {
                System.out.println(" invalid operator ");
            }


        }
        System.out.print(" result = " + result);

    }
}
