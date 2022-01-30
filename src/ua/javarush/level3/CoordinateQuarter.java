package ua.javarush.level3;

import java.util.Scanner;

public class CoordinateQuarter {
    public static void main(String[] args) {

        int quarter=0;

        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();

        if (x>0 && y>0){
            quarter = 1;
        }else if (x<0 && y>0){
            quarter = 2;
        }else if (x<0 && y<0){
            quarter = 3;
        } else if (x>0 && y<0){
            quarter = 4;
        }

        System.out.println(quarter);
    }
}
