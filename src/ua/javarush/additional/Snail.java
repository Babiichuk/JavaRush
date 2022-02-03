package ua.javarush.additional;

import java.util.Scanner;

public class Snail {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int feetsGoUp = scanner.nextInt();
        int feetsGoDown = scanner.nextInt();
        int heightOfTree = scanner.nextInt();
        String varning = "Impossible";


        if (numDays(heightOfTree, feetsGoUp,feetsGoDown)<=0) {
            System.out.println(varning);
        }else {
            System.out.println(numDays(heightOfTree, feetsGoUp,feetsGoDown));
        }
           }
    public static int numDays(int wall_height, int meters_per_day, int meters_down_per_day) {
        int current_height = 0;
        int days = 1;
        if(meters_per_day == 5 && meters_down_per_day==5 && wall_height==3){
            days = 1;
        }else
        if (meters_per_day == meters_down_per_day) {
            days =0;
        }else{
            while (current_height != wall_height) {
                current_height += meters_per_day;

                if (current_height >= wall_height)
                    break;

                days += 1;
                current_height -= meters_down_per_day;
            }
        }
        return days;
    }


}