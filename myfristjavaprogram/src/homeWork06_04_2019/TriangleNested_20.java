package homeWork06_04_2019;

import java.util.Scanner;

public class TriangleNested_20 {
    public static void main(String[] args) {
        int a,b,c;
        Scanner trngl = new Scanner(System.in);
        System.out.println("Enter any Number of Rows");
        int x = trngl.nextInt();


        for(a=0; a<x; a++){

            for(b=0; b<x- a; b++){
                System.out.print(" ");}

            for (c = 1; c <= 2 * a - 1; c++){
                System.out.print("@");
            }

            System.out.println();
        }
    }
}
