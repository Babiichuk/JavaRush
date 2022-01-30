package ua.javarush.level3;

import java.util.Scanner;

public class IsDigitsEquals {

    public static void main(String[] args) {
        int a, b, c;

        Scanner scanner = new Scanner(System.in);
        a = scanner.nextInt();
        b = scanner.nextInt();
        c = scanner.nextInt();

        if (a == b & a == c) {
            System.out.print(a + " " + b + " " + c);
        } else if (a == c) {
            System.out.print(a + " " + c);
        } else if (a == b) {
            System.out.print(a + " " + b );
        } else if (b == c) {
            System.out.print(b + " " + c);
//
        }
    }
}
