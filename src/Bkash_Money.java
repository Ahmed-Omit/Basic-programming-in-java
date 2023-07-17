import  java.util.*;
public class Bkash_Money
{
    public static void main(String[] args)
    {
        Scanner s= new Scanner( System.in);
        double money, charge ;
        System.out.print(" Enter thr Amount : ");
        money = s.nextDouble();
        //System.out.print(" Enter thr Amount : ");
        //charge = s.nextDouble();
        charge = 1.85;


        charge = money / (100/1.85);
        System.out.print( " Charge " + charge);
    }
}


