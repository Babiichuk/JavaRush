package ua.javarush.level3;

import java.util.Scanner;

public class HiAccuracy {

    public static void main(String[] args) {
        double a, b;

        Scanner scanner = new Scanner(System.in);
        a = scanner.nextDouble();
        b = scanner.nextDouble();

        if ( Math.abs(b - a) <= 0.000001 )
            System.out.println("числа равны");
        else
            System.out.println("числа не равны");

    }
    }


