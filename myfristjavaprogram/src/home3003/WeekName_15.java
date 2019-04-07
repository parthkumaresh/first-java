package home3003;

import java.util.Scanner;

public class WeekName_15 {
    /**
     * Description is wrong if you entered 1 then result should be " It is Monday on 1th Day of week "
     */
    public static void main(String[] args) {

        int day;
        Scanner days = new Scanner(System.in);

        System.out.print("Enter day number between 1 and 7 : ");

        day = days.nextInt();

        switch (day) {
            case 1:
                System.out.println(" It is Monday on 7th Day of week ");
                break;
            case 2:
                System.out.println(" It is Tuesday on 7th Day of week ");
                break;
            case 3:
                System.out.println(" It is Wednesday on 7th Day of week ");
                break;
            case 4:
                System.out.println(" It is Thursday on 7th Day of week ");
                break;
            case 5:
                System.out.println(" It is Friday on 7th Day of week ");
                break;
            case 6:
                System.out.println(" It is Saturday on 7th Day of week ");
                break;
            case 7:
                System.out.println(" Sunday is 7th Day of week ");
                break;
            default:
                System.out.println("Week contains 1 to 7 days only");
                break;
        }
    }

}
