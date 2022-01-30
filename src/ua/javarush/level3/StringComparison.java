package ua.javarush.level3;

import java.util.Scanner;

public class StringComparison {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String firstString = scanner.nextLine();
        String secondString = scanner.nextLine();

        if (firstString.equals(secondString)){
            System.out.println("строки одинаковые");
        } else {
            System.out.println("строки разные");
        }

    }
}
