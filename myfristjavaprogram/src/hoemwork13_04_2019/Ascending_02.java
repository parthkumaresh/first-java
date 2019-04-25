package hoemwork13_04_2019;

import java.util.Scanner;

public class Ascending_02 {

    /*Not Working as expected*/

    public static void main(String[] args) {
        int num, i, j, temp;
        Scanner sac = new Scanner ( System.in);
        System.out.println( " Enter the number of integers to  sort :  ");
        num = sac.nextInt();

        int array [] = new int [ num ];
        System.out.println( " Enter " + num + " integers : ");

        for ( i = 0 ;  i < num ; i++ )
            array [i] = sac.nextInt();
        for ( i = 0 ; i < ( num - 1); i++ );
            for ( j = 0 ; j < i - 1; j++ );
            if ( array [j] > array [j+1]) {
                temp = array[j];
                array[j] = array[j + 1];
                array[j + 1] = temp;
            }
             System.out.println( " sorted number of integers  ");

               for ( i = 0; i < num; i++);
                System.out.println( array [i]);
          }
          }
