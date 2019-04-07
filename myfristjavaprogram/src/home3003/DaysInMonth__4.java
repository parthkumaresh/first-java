package home3003;

import java.util.Scanner;

public class DaysInMonth__4 {
    public static void main(String[] args) {
        /**
         * This programme is working as expected
         * Good Work
         */
        int month;
        int year;

        System.out.println("\n\"Enter Day Of Month:\"\n");
        Scanner daymon = new Scanner(System.in);
        month = daymon.nextInt();

        System.out.println("\n\"Enter Year:\"\n");
        year = daymon.nextInt();

        System.out.println("Number of Days are:"+getDaysInMonth(month,year));
    }

    public static boolean leapYear(int year) {

        boolean check;

        if (year > 1 || year < 9999) {
            if (year % 400 == 0) {
                check = true;

            } else if (year % 100 == 0 && year % 400 != 0) {
                check = false;

            } else if (year % 4 == 0 && year % 100 != 0) {
                check = true;


            } else {
                check = false;
            }
            return check;
        } else {
            return false;
        }
    }
    public static int getDaysInMonth ( int month, int year){

        if (year < 1 || year > 9999) {
            return -1;  //out of range year
        }

        if (month < 1 || month > 12) {
            return -1;  // out of range month
        } else if (month == 4 || month == 6 || month == 9 || month == 11) {
            return 30;
        } else if (month == 2) {
            if (leapYear(year) == true) {
                return 29;  // leap year so feb has 29 days
            } else {
                return 28;  // not leap year
            }
        } else {
            return 31;
        }
    }
    }

