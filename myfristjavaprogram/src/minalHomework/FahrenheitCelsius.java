package minalHomework;

import java.util.Scanner;

public class FahrenheitCelsius {

    public static void main ( String [] args ){

        Scanner cel = new Scanner(System.in);
        System.out.println( " Enter the degree of temprature ");

        double fahrenheit = cel.nextDouble();

        double celsius = ( 5 *(fahrenheit - 32.0) / 9.0);

        System.out.println( " The value of " +cel+ " is " + celsius);

        System.out.println(fahrenheit + " degree Fahrenheit is equal to " + celsius + " in Celsius ");

    }
}
