package homeWork06_04_2019;

import java.util.Scanner;

public class FibonacciNumber_9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter Number " );
        int no =sc.nextInt();
        no=no-2;
        int a=0,b=1,c;
        System.out.print(a +"  "+ b);
        for( int i=1;i<=no;++i)
        {
            c=a+b;
            System.out.print(" "+ c);
            a=b;
            b=c;
    }
    }

}
