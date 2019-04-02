package home3003;

import java.util.Scanner;

public class LeapYearLesson_2 {
    public static void main(String[] args)
    {
        Scanner days = new Scanner(System.in);
        int year = days.nextInt();
        boolean Leap = false;

        if (year % 4 == 0)
        {
            if (year % 100 == 0)
            {
                if (year % 400 == 0)

                    Leap = true;
                else
                    Leap = false;
                } else

                Leap = true;
        }   else
            {
            Leap = false;
            }
        if ( Leap == true)
            System.out.println(year + "  is a leap year.");
        else
            System.out.println(year + "  is a not leap year");
        }
    }



