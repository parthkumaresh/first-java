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

        System.out.println("|-------------------------------------------|");
        System.out.println("|                \"Marksheet\"               |");
        System.out.println("|-------------------------------------------|");
        System.out.println("| Name       :       "+str+"                     |");
        System.out.println("| Rollno     :       " +a+"                     |" );
        System.out.println("|----------------------------------------|");
        System.out.println("|Subjects    :      Marks                   |");
        System.out.println("|-------------------------------------------|");
        System.out.println("| Maths      :      " +b+"                    |");
        System.out.println("| English    :      " +c+"                  |");
        System.out.println("| Science    :      " +d+"                  |");
        System.out.println("|-------------------------------------------------|");
        System.out.println("| Total      :       "+ sum+"                       |");
        System.out.println("| Percentage :       " +average+"%                      |");



        if (average>35) {
            System.out.println("\n|pass/fail:     \"Pass\"                       |\n");
        }
        else {
            System.out.println("\n|pass/fail :   \"Fail\"                       |\n");
        }
        if (average>=80) {
            System.out.println("|Grade     :     \"A+\"                     |\n");
        }
        else if (average>=60){
            System.out.println("|Grade      :     \"A\"                     |\n");
        }
        else if (average>=50){

            System.out.println("|Grade      :     \"B\"                    |\n");
        }
        else if (average>=35) {

            System.out.println("|Grade      :      \"C\"                    |\n");
        }
        else if (average<35){
            System.out.println("|Grade       :      \"D\"                    |\n");
        }
        System.out.println("|----------------------------------------------------|\n");

    }
}
