package hoemwork13_04_2019;

import java.util.Scanner;

public class RhombusStructure_08 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Input the numbers : ");
        int odd = 1;
        int odd2 = 1;
        int letters  = 2;
        letters  = sc.nextInt();
        char c = 'A';

        for (int i = 1; i < (letters * 2); i++)
        {
            for (int spc = letters  - odd2; spc > 0; spc--)
            //print space
            {
                System.out.print(" ");
            }
            if (i < letters)
            {
                odd2++;
            }
            else
            {
                odd2--;
            }
            for (int j = 0; j < odd; j++)
            {
                System.out.print(c);//print Character
                if (j < odd / 2)
                {
                    c++;
                } else
                {
                    c--;
                }
            }
            if (i < letters)
            {
                odd = odd  + 2;
            }
            else
            {
                odd = odd - 2;
            }
            c = 'A';

            System.out.println();
        }
        }


    }

