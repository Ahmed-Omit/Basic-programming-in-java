import java.util.*;
public class Parten
{
    public static void main(String[] args)
    {

       Scanner a=new Scanner(System.in);
        int i,j;
        for(i=1;i<=6;i++)
        {
            if( i==2)
            {
                continue;
            }
            for(j=1;j<=6;j++)
            {
                if(j==2)
                {
                    continue;
                }

                System.out.print(" " + j );
            }
            System.out.println();
        }
    }
}
