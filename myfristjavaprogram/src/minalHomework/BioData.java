package minalHomework;

import java.util.Scanner;

public class BioData {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter my name ");
        String name = scanner.next();
        System.out.println("Enter date of birth");
        String dob =  scanner.next();
        System.out.println("Enter the address");
        String place = scanner.next();
        System.out.println( );


        System.out.println("My name is " +name);
        System.out.println("My birth date is " +dob);
        System.out.println("My address is " +place);
        }
}
