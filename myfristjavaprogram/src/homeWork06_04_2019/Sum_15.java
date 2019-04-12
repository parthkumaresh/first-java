package homeWork06_04_2019;

import java.util.Scanner;

public class Sum_15 {
    public static void main(String[] args) {
        int n, sum = 0;
        Scanner s = new Scanner(System.in);
        System.out.print("\nEnter elements of array:\n");
        n = s.nextInt();
        int a[] = new int[n];
        System.out.println("\nEnter all the elements:\n");
        for (int i = 0; i < n; i++) {
            a[i] = s.nextInt();
            sum = sum + a[i];
        }
        System.out.println("\nSum:\n" + sum);
    }
}