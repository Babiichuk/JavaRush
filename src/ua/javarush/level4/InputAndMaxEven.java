package ua.javarush.level4;

import java.util.Scanner;

public class InputAndMaxEven {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int max= -2147483648;

        while (console.hasNextInt())
        {
            int x = console.nextInt();
            if (x%2 ==0 && x > max)
                max = x;
        }
        System.out.println(max);
    }

}
