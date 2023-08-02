import java.util.*;
public class sum
{
    public static void main(String[]args)
    {

        Scanner s = new Scanner(System.in);
        int x,y,sum=0,i;
        //System.out.print(" Enter the value of x : ");
        //x=s.nextInt();
        //System.out.print(" Enter the value of y : ");
        for(i=1;i<=3;i++)
        {
            if(i==2)
            {
                continue;
            }
            sum=sum+i;
            //return sum;
        }
        //return sum;
        System.out.print(" summation : "  + sum);


    }


}
