package minalHomework;

import java.util.Scanner;

public class Calculator {
    static int a = 10;
    static int b = 20;
    int ans = a+b;
    int ans1 = b-a;
    int ans2 = a*b;
    double ans3 = b/a;



    public static void main (String[] args) {
        Calculator rid = new Calculator();
        rid.addition();
        rid.subtraction();
        rid.multi();
        rid.division();
    }

    public static void addition(){
        Scanner scanner = new Scanner(System.in);
        System.out.println ( "Enter first the digit" );
        int a = scanner.nextInt();
        System.out.println (" Enter the second digit" );
        int b = scanner.nextInt();
        int ans = a+b;
        System.out.println(" The addition of " +a+  " and "  +b+ " is "+ ans);
    }

       public static void subtraction(){
        Scanner scanner = new Scanner( System.in);
        System.out.println( " Enter first digit ");
        int b = scanner.nextInt();
        System.out.println( "Enter the second digit ");
        int a = scanner.nextInt();
        int ans1 = b-a;
        System.out.println( " The subtraction of " +b+ " and "  +a+ " is " + ans1);


    }

       public void multi (){
        Scanner scanner = new Scanner( System.in);
        System.out.println(" Enter first digit ");
        int a = scanner.nextInt();
        System.out.println(" Enter first digit ");
        int b = scanner.nextInt();
        int ans2 = a*b;
        System.out.println(  " The multi of " +a+  " and " +b+ " is " + ans2  );

    }

       public void division(){
        Scanner scanner = new Scanner( System.in );
        double b = scanner.nextInt();
        System.out.println( " Enter first digit ");
        double a = scanner.nextInt();
        System.out.println( " Enter first digit ");
        double ans3 = b/a;
        System.out.println(" The division of " +b+ " and " +a+ " is " + ans3);

    }


}
