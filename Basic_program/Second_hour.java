import java.util.*;
public class Second_hour
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        int Second;
        int hour;

        System.out.print(" Enter the Second : ");
        Second = s.nextInt();


        int mineat =Second/60;

        hour=mineat/60;
        mineat=mineat%60;
        Second=Second%60;
        System.out.println("hour :  " +hour);
        System.out.println("mineat:  " +mineat);
        System.out.println(" Second :  " + Second);





    }
}
