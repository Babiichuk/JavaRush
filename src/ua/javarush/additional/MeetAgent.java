package ua.javarush.additional;

import java.util.Scanner;

public class MeetAgent {
    final static int password = 133976; //You can change pass, but don't change the type

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int pass = scanner.nextInt();
        if (pass==password)
            System.out.println("Hello, Agent");
        else
            System.out.println("Access denied");
    }
}
