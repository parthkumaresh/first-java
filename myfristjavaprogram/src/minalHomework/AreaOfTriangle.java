package minalHomework;

import java.util.Scanner;
public class AreaOfTriangle {


    public static void main(String[] args) {
        AreaOfTriangle af = new AreaOfTriangle();
      af.areaOfTriangle();


    }

    public void areaOfTriangle(){
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Enter the height of triangle ");
        double h = scanner.nextDouble();
        System.out.println(" Enter the base of triangle ");
        double b = scanner.nextDouble();
        double area = (h*b)/2;
        System.out.println("The area of triangle with height = " +h+ " and base = " +b+  " is " +area );
    }

   // public static void areaTriangle(){
       // double h = 10.5;
        //double b = 20.5;
        //double area = (h*b)/2;
        //System.out.println("The area of tringle with hight = " +h+ " and base = " +b+  " is " +area );

}
