package java;
import java.util.*;
public class test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double[] a = new double[n];
        for (int i = 0; i < n; i++)
            a[i] = sc.nextDouble();
        System.out.println("Scores:");
        for (int i = 0; i < n; i++) {
            System.out.print((int)a[i] + " ");
            if ((i + 1) % 4 == 0) System.out.println();
        }
        double sum = 0, min = a[0], max = a[0];
        for (double x : a) {
            sum += x;
            if (x < min) min = x;
            if (x > max) max = x;
        }
        double avg = sum / n;
        System.out.printf("\nAverage: %.2f\n", avg);
        System.out.printf("Lowest Score: %.0f\n", min);
        System.out.printf("Highest Score: %.0f\n\n", max);
        System.out.println("Score  Deviation");
        double sq = 0;
        for (double x : a) {
            double d = x - avg;
            System.out.printf("%.0f  %.2f\n", x, d);
            sq += d * d;
        }
        double sd = Math.sqrt(sq / n);
        int count = 0;
        for (double x : a)
            if (x >= avg - sd && x <= avg + sd)
                count++;
        System.out.printf("\nStandard Deviation: %.2f\n", sd);
        System.out.println("Scores within one standard deviation: " + count);
    }
}
