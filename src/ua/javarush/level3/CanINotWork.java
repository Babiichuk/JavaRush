package ua.javarush.level3;

import java.util.Scanner;

public class CanINotWork {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int age  = scanner.nextInt();
        boolean isYoung = (age < 20);
        boolean isOld = (age > 60);

        if (isYoung || isOld )
        System.out.println("можно не работать");
    }
}

