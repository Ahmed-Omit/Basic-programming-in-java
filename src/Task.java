import java.util.*;
public class Task
{
    public static void main(String[] args)
    {
        Scanner s= new Scanner(System.in);
       int price = 3500000,Salary;
       int Need_month, year;
        double month;

        System.out.print(" Enter the salary amount : ");
        Salary =s.nextInt();

        Need_month =price/Salary;
        //System.out.println("Need month : " + Need_month);

       year=Need_month/12;
       month =Need_month%12;
       System.out.print(" Needed " + year + " year " + month+ " month");
    }
}
