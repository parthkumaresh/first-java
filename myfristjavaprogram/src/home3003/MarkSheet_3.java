package home3003;

import java.util.Scanner;

public class MarkSheet_3 {
    public static void main(String[] args) {
        /**
         * Please run this programme as no result shown in console
         * See example after this programme
         */

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
        /**
         *public class MarkSheet_3 {

         public static void main(String[] args)
         {
         Scanner scanner = new Scanner(System.in);
         System.out.print(" \nEnter Student Name\t: " );
         String name = scanner.next();
         System.out.print("Enter Student RollNo: " );
         int rollNo = scanner.nextInt();
         System.out.print("Enter Maths Marks\t: " );
         int maths = scanner.nextInt();
         System.out.print("Enter English Marks\t: " );
         int english = scanner. nextInt();
         System.out.print("Enter Science Marks\t: " );
         int science = scanner.nextInt();
         int total = maths+science+english;
         int percentage= total/3;

         System.out.print("\n|-------------------------------------------|");
         System.out.print("\n|\t\t\t\t MarkSheet"+"\t\t\t\t\t|");
         System.out.print("\n|-------------------------------------------|");
         System.out.print("\n|\t Name \t\t\t:\t\t"+ name+"\t\t\t|");
         System.out.print("\n|\t RollNo\t\t\t:\t\t" + rollNo+"\t\t\t|" );
         System.out.print("\n|-------------------------------------------|");
         System.out.print("\n|\t Subjects\t\t:  \t\tMarks\t\t\t|");
         System.out.print("\n|-------------------------------------------|");
         System.out.print("\n|\t Maths\t\t\t: \t\t " +maths+"\t\t\t\t|");
         System.out.print("\n|\t English\t\t: \t\t " +english+"\t\t\t\t|");
         System.out.print("\n|\t Science\t\t: \t\t " +science+"\t\t\t\t|");
         System.out.print("\n|-------------------------------------------|");
         System.out.print("\n|\t Total\t\t\t: \t\t"+ total+"\t\t\t\t|");
         System.out.print("\n|\t Percentage\t\t: \t\t" +percentage+"%\t\t\t\t|");


         if (percentage>=35)

         {
         System.out.print("\n|\t pass/fail\t\t:  \t\tPass\t\t\t|");
         }
         else
         {
         System.out.print("\n|\t pass/fail\t\t:  \t\tFail\t\t\t|");

         }
         if (percentage>= 80)
         {
         System.out.print("\n|\t Grade\t\t\t:  \t\tA+\t\t\t\t|");
         } else if (percentage >= 60)
         {
         System.out.print("\n|\t Grade\t\t\t:  \t\tA\t\t\t\t|");

         }else if(percentage>=50)
         {
         System.out.print("\n|\t Grade\t\t\t:  \t\tB\t\t\t\t|");

         }else if (percentage>=35)
         {
         System.out.print("\n|\t Grade\t\t\t:  \t\tC\t\t\t\t|");
         }
         System.out.print("\n|-------------------------------------------|");

         }

         }

         */
    }
}
