package ua.javarush;

import java.util.Scanner;

public class CanINitWork {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int age  = scanner.nextInt();
        boolean isYoung = (age < 20);
        boolean isOld = (age > 60);

        if (isYoung || isOld )
        System.out.println("можно не работать");
    }
}

