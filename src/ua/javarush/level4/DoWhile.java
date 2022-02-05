package ua.javarush.level4;

import java.nio.channels.ScatteringByteChannel;
import java.util.Scanner;

public class DoWhile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
        int number = scanner.nextInt();

        do {
            System.out.println(string);
            number--;
        } while (number > 0 && number < 4);

    }
}
