package hoemwork13_04_2019;

import java.util.Calendar;

public class DateDisplay_25 {
    public static void main(String[] args)

            /*Working as expected*/

    {

        Calendar c = Calendar.getInstance();//Added Calendar util............
        System.out.println("Current Date: ");// We can add Day...........
        System.out.format("%tB %te, %tY%n", c, c, c);
        //  System.out.format("%tl:%tM %tp%n", c, c, c);//After adding Date we can add Day and sout it......
    }
}
