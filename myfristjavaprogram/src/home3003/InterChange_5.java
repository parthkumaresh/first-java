package home3003;

import java.util.Scanner;

public class InterChange_5 {

    public static void main(String args[]) {

        int x;
        int y;

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter value of first digit: ");
        x = scan.nextInt();

        System.out.print("Enter value of second digit: ");
        y = scan.nextInt();

        System.out.println("Before swapping - first digit : "+ x +", second digit : " + y);


        x=x+y;
        y=x-y;
        x=x-y;

        System.out.println("After swapping  - first digit : "+ x +", second digit : " + y);



    }
}
