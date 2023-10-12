import java.util.Scanner;
public class Mounthtodayconverter
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);

        System.out.print(" Enter month  : ");
        int month = s.nextInt();

        int days=switch (month)
        {
            case  1,3,5,7,8,10,12 ->31;
            case 4,6,9,11 ->30;
            case 2->
            {
                System.out.print(" Enter year  : ");
                int year = s.nextInt();

                if (year % 400==0)
                {
                   yield 29;
                }
                else if (year % 100==0)
                {
                  yield  28;
                }
                else if (year % 4==0)
                {
                  yield  29;

                }
                else
                    yield  28;


            }
            default -> 0;

        };
        System.out.println(" The month hava " + days + " days ");

    }
}
