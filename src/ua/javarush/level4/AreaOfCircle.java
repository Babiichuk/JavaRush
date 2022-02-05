package ua.javarush.level4;

import java.util.Scanner;

public class AreaOfCircle {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int radius = scanner.nextInt();

        double pi = 3.14;
        int square = (int) (pi * radius * radius);

        System.out.println(square);

    }

}
