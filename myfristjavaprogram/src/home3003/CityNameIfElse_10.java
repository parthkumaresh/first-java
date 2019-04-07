package home3003;

import java.util.Scanner;

public class CityNameIfElse_10 {
    public static void main(String[] args) {
        /**
         * This is perfect
         */

        Scanner intp = new Scanner(System.in);

        System.out.print("Enter city name: ");

        char cityName;

        cityName = (char) intp.next().charAt(0);

        if (cityName == 'a'){

            System.out.println( "\nAthens ");}

        else if (cityName == 'b'){

            System.out.println("\nBarcelona");}

        else if (cityName == 'c'){

            System.out.println("\nCardiff");}

        else if (cityName == 'd'){

            System.out.println("\nDover");}

        else if (cityName == 'e'){

            System.out.println("\nElizabeth");}

        else if (cityName == 'f'){

            System.out.println("Florence");}

        else

            System.out.println("Invalid City Name:  ");
    }

    }



