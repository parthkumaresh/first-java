package home3003;

import java.util.Scanner;

public class Calculator_12 {
        public static void main(String args[])
        {
            /**
             * This programme is working as expected
             * Good Work
             */
            int a, b, res;
            char ch;
            Scanner scan = new Scanner(System.in);

            System.out.print("Enter First Number : ");
            a = scan.nextInt();
            System.out.print("Enter Second Number : ");
            b = scan.nextInt();
            System.out.print("Enter Operator (+, -, *, /) : ");
            ch = scan.next().charAt(0);

            if(ch == '+')
            {
                res = a + b;
                System.out.print("Result = " +res);
            }
            else if(ch == '-')
            {
                res = a - b;
                System.out.print("Result = " +res);
            }
            else if(ch == '*')
            {
                res = a * b;
                System.out.print("Result = " +res);
            }
            else if(ch == '/')
            {
                res = a / b;
                System.out.print("Result = " +res);
            }
            else
            {
                System.out.print("Wrong Operator !!!");
            }

        }
    }

