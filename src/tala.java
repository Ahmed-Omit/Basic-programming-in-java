import java.util.Scanner;

class tala {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n, i, j, c = 0;
        System.out.print(" Enter thr N : ");
        n = s.nextInt();

        for (i = 1; i <= n; i++) {
            if (n % i == 0) {
                c = c + 1;
            }

        }

        if (c == 2) {
            System.out.print("number is prime");
        } else
            System.out.println("number is not prime");

    }
}