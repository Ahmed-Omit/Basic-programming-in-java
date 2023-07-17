
import java.util.*;

public class Money_Exchange {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double b_m, usa_m, c_m;
        System.out.print(" Enter the Bangladeshi money : ");
        b_m = s.nextDouble();
        System.out.print(" Enter the Exchange rate : ");
        usa_m = s.nextDouble();
        System.out.print(" Enter the Exchange rate : ");
        c_m = s.nextDouble();

        usa_m = b_m * usa_m;
        System.out.println(" Usa = " + usa_m);
        c_m = b_m * c_m;
        System.out.print(" Canada = " + c_m);
    }
}
