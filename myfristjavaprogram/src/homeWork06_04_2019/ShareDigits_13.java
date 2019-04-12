package homeWork06_04_2019;

import java.util.Scanner;

public class ShareDigits_13 {
    public static void main(String[] args) {


            Scanner in = new Scanner(System.in);
            System.out.print("Input the first number : ");
            int a = in.nextInt();
            System.out.print("Input the second number: ");
            int b = in.nextInt();
            System.out.println("Result: "+hasSharedDigit(a, b));
        }

        public static boolean hasSharedDigit(int p, int q)
        {
            if (p<25 || q>75)
                return false;
            int x = p % 10;
            int y = q % 10;
            p /= 10;
            q /= 10;
            return (p == q |p == y || x == q || x == y);
        }
    }


