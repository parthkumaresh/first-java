package hoemwork13_04_2019;

import java.util.Scanner;

public class ReserveName_01 {
    public static void main(String[] args) {

        /*Working as expected*/

        int num, reverse  = 0;
        System.out.println(" Enter an inter the reserve ");
        Scanner total = new Scanner ( System.in);
        num=total.nextInt();
        while ( num != 0){

            reverse = reverse * 10;
            reverse = reverse + num%10;
            num = num /10;}
        System.out.println( " Reserve of the number is " + reverse );
        }
        }
