import java.util.*;
public class BMI_Count
{
    public static void main(String[] args)
    {
        Scanner s= new Scanner(System.in);
        float Weight,height,BMI;
        System.out.print(" Enter the Weight : ");
        Weight = s.nextFloat();
        System.out.print(" Enter the  : ");
        height = s.nextFloat();

        BMI =( Weight / (height*height));
        System.out.print(BMI);
    }
}
