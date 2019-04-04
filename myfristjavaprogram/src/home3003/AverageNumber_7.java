package home3003;

import java.util.Scanner;

public class AverageNumber_7 {

    public static void main(String[] args) {


        Scanner scanner=new Scanner(System.in);

        System.out.println("Enter Value 1\t:");
        int a = scanner.nextInt();

        System.out.println("Enter Value 2\t:");
        int b = scanner.nextInt();

        System.out.println("Enter Value 3\t:");
        int c = scanner.nextInt();

        System.out.println("Enter Value 4\t:");
        int d = scanner.nextInt();

        System.out.println("Enter Value 5\t:");
        int e = scanner.nextInt();

        double sum =a+b+c+d+e;
        System.out.println("Addition is: "+sum);

        double average = sum/5;
        System.out.println("Average of 5 number is\t:"+average);
    }


    }
