//import java.util.Scanner;

class omit {
    public static void main(String[] args) {
        // Scanner s=new Scanner(System.in);
        int i, j, c = 0;
        for (i = 0; i <= 50; i++) {
            for (j = 1; j <= i; j++)
                if (i % j == 0) {
                    c = c + 1;
                }

        }
        if (c == 2) {
            System.out.print("number is prime" + i);
        }

        System.out.println("Here");

    }
}