package ua.javarush.level3;

import java.util.Scanner;

public class ComparisonIgnoreCase {

    public static String secret = "AmIGo";

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String userPhrase = scanner.nextLine();

        if(secret.equalsIgnoreCase(userPhrase))
        System.out.println("доступ разрешен");
        else
        System.out.println("доступ запрещен");
    }
}
