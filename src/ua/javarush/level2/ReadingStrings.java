package ua.javarush.level2;

import java.util.Scanner;

public class ReadingStrings {

    public static void main(String[] args) {
        Scanner scaner = new Scanner(System.in);
        String s1,s2,s3;
        s1 = scaner.nextLine();
        s2 = scaner.nextLine();
        s3 = scaner.nextLine();

        System.out.println(s3);
        System.out.println(s2.toUpperCase());
        System.out.println(s1.toLowerCase());
    }

}
