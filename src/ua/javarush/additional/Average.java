package ua.javarush.additional;

import java.util.Scanner;

public class Average {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int sum = number;
        int counter = 0;
        while (number != 0) {

            number = scanner.nextInt();
            sum = sum + number;
            counter++;

        }
        System.out.println(sum / counter);
    }
}
