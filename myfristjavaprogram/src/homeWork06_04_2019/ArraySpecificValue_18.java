package homeWork06_04_2019;

import java.util.Scanner;

public class ArraySpecificValue_18 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Any Value");
        int n = sc.nextInt();
        int y = 0;
        int a[] = {2, 4, 6, 8, 10, 50, 55, 43};


        if (a[0] == n || a[1] == n || a[3] == n || a[4] == n) {
            System.out.println("Value is in Array");
        } else {
            System.out.println("Value is not in Array");
        }
    }
    }
