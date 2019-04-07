package home3003;

import java.util.Scanner;

public class SalesCommission_9 {

    public static void main(String[] args) {
        /**
         * Well Done
         */
        Scanner scanner = new Scanner(System.in);

        String name;
        int id;
        int sales;
        int salary;

        System.out.println("Enter Saler Name\t:   ");
        name = scanner.next();

        System.out.println("Enter Saler id\t\t:   ");
        id = scanner.nextInt();

        System.out.println("Enter Sales Amount\t: ");
        sales = scanner.nextInt();

        System.out.println("Enter Salary: ");
        salary = scanner.nextInt();

        double salesC = 0;

        if (sales >= 50000) {
            salesC = (sales * 35 / 100);

        } else if (sales >= 30000) {
            salesC = (sales * 20 / 100);

        } else if (sales >= 20000) {
            salesC = (sales * 10 / 100);

        } else if (sales >= 10000) {
            salesC = (sales * 5 / 100);

        } else if (sales <= 10000) {
            salesC = (sales * 2 / 100);
        }

        double total = salary + salesC;


        System.out.println("========================================================");
        System.out.println("========================================================");
        System.out.println("|             \"SALARY SLIP\"                          |");
        System.out.println("========================================================");
        System.out.println("========================================================");
        System.out.println("\tEmployee Name\t\t:\t" + name);
        System.out.println("\tEmployee ID\t\t\t:\t" + id);
        System.out.println("========================================================");
        System.out.println("========================================================");
        System.out.println("\tBasic Salary\t\t:\t" + salary);
        System.out.println("\tSales Commission\t:\t" + salesC);
        System.out.println("\tTotal\t\t\t\t:\t" + total);
        System.out.println("========================================================");
        System.out.println("========================================================");
    }

    }
