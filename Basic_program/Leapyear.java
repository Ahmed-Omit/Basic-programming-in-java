import java.util.Scanner;

public class Leapyear
{
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        int year;
        year=s.nextInt();
        if (year % 400==0)
        {
            System.out.println(year+" is lear year");
        }
        else if (year % 100==0)
        {
            System.out.print( year +" is not leap year");
        }
        else if (year % 4==0)
        {
            System.out.println(year+" is leap year");

        }
        else
            System.out.print( year +" is not leap year");

    }

}
