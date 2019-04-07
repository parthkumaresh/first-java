package home3003;

import java.util.Scanner;

public class OddEven_8 {

        public static void main(String[] args) {

            /**
             * This programme is working as expected
             * */
            int oddeven;


            System.out.println("\nEnter \"DIGIT\" to check if it is \"ODD\" or \"EVEN\"\n");

            Scanner in = new Scanner(System.in);
            oddeven = in.nextInt();

            if (oddeven % 2 == 0)

                System.out.println("This number is \"EVEN NUMBER\"  ");

            else
                System.out.println("This number is \"ODD NUMBER\"");
        }
    }

