package home3003;

import java.util.Scanner;

public class Switch_11
    {
    public static void main(String[] args)
        {
        Scanner intp = new Scanner(System.in);
        System.out.print("Enter city name: ");

        char cityName;
        cityName = intp.next().charAt(0);

        switch (cityName)
            {
            case 'a':
                System.out.println(" Athens ");

                break;

            case 'b':

                System.out.println(" Boston ");

                break;

            case 'c':

                System.out.println(" Cardiff ");

                break;

            case 'd':

                System.out.println(" Dover ");

                break;

            case 'e':

                System.out.println(" Elizabeth ");

                break;

            case 'f':

                System.out.println(" Florence ");

                break;
            default:

                System.out.println("Invalid City name !");

                break;
            }
        }
    }
