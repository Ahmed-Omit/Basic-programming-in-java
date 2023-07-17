import java.util.*;

public class Arraytest {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print(" Enter the number of element : ");
        int n = s.nextInt();
        double[] fpi = new double[n];
        // System.out.print(" Enter the element : ");
        for (int i = 0; i < n; i++) {
            System.out.print(" Enter the element : ");
            fpi[i] = s.nextDouble();
        }
        double sum = 0;
        for (int i = 0; i < n; i++) {
            sum = sum + fpi[i];
        }
        double average = sum / n;
        System.out.println("The average  number is " + n + " numbers: " + average);

    }

}
