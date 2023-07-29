import java.util.Scanner;

public class PrimeNumbers {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n, i, j, b;
        System.out.print(" Enter the value of n : ");
        n = s.nextInt();
        for (i = 1; i <= n; i++) {
            b = 0;
            for (j = 1; j <= i; j++) {
                if (i % j == 0) {
                    b = b + 1;
                }
            }

            if (b == 2)
                System.out.println(i);
        }
    }
}
