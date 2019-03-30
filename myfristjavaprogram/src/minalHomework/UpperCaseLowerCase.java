package minalHomework;

import java.util.Scanner;

public class UpperCaseLowerCase {

    public static void main ( String [] args){

    Scanner letters = new Scanner( System.in);
        System.out.println( " Enter String ");
        String str = letters.nextLine();
        System.out.println( " UpperCase String "+ str.toUpperCase());
        System.out.println( " Lower String "+ str.toLowerCase());

    }


}
