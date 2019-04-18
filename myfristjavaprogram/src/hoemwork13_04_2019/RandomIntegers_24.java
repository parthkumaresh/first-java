package hoemwork13_04_2019;

import java.util.Scanner;

public class RandomIntegers_24 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Input the starting number of range : ");
        int rsnum = sc.nextInt();
        System.out.println("Input the endind number of range : ");
        int renum = sc.nextInt();
        int random_number = rsnum+(int)(Math.random()*((renum-rsnum)+1));
        System.out.println(random_number);
    }
}
