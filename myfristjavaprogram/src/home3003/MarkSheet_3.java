package home3003;

import java.util.Scanner;

public class MarkSheet_3 {
    public static void main(String[] args) {
        Scanner total = new Scanner ( System.in);

        String str = total.next();
        System.out.println( " Enter the Student Name:   " + str);
        int a = total.nextInt();
        System.out.println( " Enter  the Roll No.:   " +a);
        int b = total.nextInt();
        System.out.println( " Enter English  " + b);
        int c = total.nextInt();
        System.out.println( " Enter Science  " + c);
        int d = total.nextInt();
        System.out.println( " Enter Maths  " + d);

        int sum = b+c+d;
        System.out.println( "  Total " + sum);
        double average =  sum/3;
        System.out.println( " Average " + average );
    }
}
