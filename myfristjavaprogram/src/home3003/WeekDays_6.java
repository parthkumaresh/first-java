package home3003;

import java.util.Scanner;

public class WeekDays_6 {
    public static void main(String[] args) {
    /**
    * This programme should be
     * WAP to input employee id, name, basic salary then find HRA, TA, DA, PF and Gross
     salary
     HRA = basic salary 10%
     DA = Basic salary 8%
     TA = Basic salary 9%
     PF= Basic salary 20%
     Gross salary = basic salary + HRA + TA + DA –PF
     Print in following format
     ________________________________
     | Salary Slip |
     |_______________________________|
     | Employee Id : 2564 |
     | Employee Name : Jay |
     |_______________________________|
     | Basic Salary : 25000.0 |
     | HRA 10% : 2500.0 |
     | TA 8% : 2250.0 |
     | DA 9% : 2000.0 |
     | PF - 20&amp; : 5000.0 |
     |______________________________|
     | Gross Salary : 26750.0 |
     |==============================|
    */
        //  Scanner names = new Scanner(System.in );
        // System.out.println( " Enter the names of the days: " );
        int day;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter day number between 1 and 7 : ");

        day = sc.nextInt();

        switch (day) {


                case 1:
                    System.out.println("1st Day of week is Monday");
                    break;
                case 2:
                    System.out.println("2nd Day of week is Tuesday");
                    break;
                case 3:
                    System.out.println("3rd Day of week is Wednesday");
                    break;
                case 4:
                    System.out.println("4th Day of week is Thursday");
                    break;
                case 5:
                    System.out.println("5th Day of week is Friday");
                    break;
                case 6:
                    System.out.println("6th Day of week is Saturday");
                    break;
                case 7:
                    System.out.println("7th Day of week is Sunday");
                    break;
                default:
                    System.out.println("Week contains 1 to 7 days only");
                    break;
            }
        }
    }