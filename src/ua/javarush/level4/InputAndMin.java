package ua.javarush.level4;

import java.util.Scanner;

public class InputAndMin {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int min = 2147483647;

        while (console.hasNextInt())
        {
            int x = console.nextInt();
            if (x < min)
                min = x;
        }
        System.out.println(min);
    }

}
