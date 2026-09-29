package java;
import java.util.*;
public class test_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        String[] input = line.trim().split("\\s+");
        int n = input.length;
        int[] positive = new int[n];
        int[] negative = new int[n];
        int p = 0;
        int neg = 0;
        for (int i = 0; i < n; i++) {
            int num = Integer.parseInt(input[i]);
            if (num >= 0) {
                positive[p] = num;
                p++;
            } else {
                negative[neg] = num;
                neg++;
            }
        }
        int i = 0, j = 0;
        while (i < p && j < neg) {
            System.out.print(positive[i] + " ");
            i++;
            System.out.print(negative[j] + " ");
            j++;
        }
        while (i < p) {
            System.out.print(positive[i] + " ");
            i++;
        }
        while (j < neg) {
            System.out.print(negative[j] + " ");
            j++;
        }
        System.out.println();
    }
}