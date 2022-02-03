package ua.javarush.additional;

import java.util.Scanner;

public class MeetStrangers {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int numberOfStrangers = scanner.nextInt();
        if (numberOfStrangers == 0) {
            System.out.println("Oh, it looks like there is no one here");
        } else if (numberOfStrangers < 0) {
            System.out.println("Seriously? Why so negative?");
        } else {
            String[] names = new String[numberOfStrangers];
            int count= 0;
            names[0] = scanner.nextLine();
            while (count < names.length) {
                names[count] = scanner.nextLine();
                count++;
            }
            int temp = 0;
            while (temp < names.length) {
                System.out.println("Hello, " + names[temp]);
                temp++;
            }
        }
    }
}
