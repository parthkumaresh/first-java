package home3003;

public class Devision_13 {
    public static void main(String[] args) {
        int one = 1;
        int hundred = 100;
        int number;

        System.out.println("\nDivide by 3 :\n");

        for (number = one; number <= hundred; ++number) {
            if (number % 3 == 0) {

                System.out.print(" " + number);
            }
        }
        System.out.println("\n\nDivide by 5 :\n");

        for (number = one; number <= hundred; ++number) {
            if (number % 5 == 0) {

                System.out.print(" " + number);
            }
        }
        System.out.println("\n\nDivided by 3 & 5: \n");

        for (number=1; number<100; number++) {
            if (number%3==0 && number%5==0)

                System.out.print(number +", ");
        }
        System.out.println("\n");

    }
}
