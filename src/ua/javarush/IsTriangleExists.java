package ua.javarush;

import java.util.Scanner;

public class IsTriangleExists {

    private static final String TRIANGLE_EXISTS = "треугольник существует";
    private static final String TRIANGLE_NOT_EXISTS = "треугольник не существует";

    public static void main(String[] args) {
        int a, b, c;

        Scanner scanner = new Scanner(System.in);
        a = scanner.nextInt();
        b = scanner.nextInt();
        c = scanner.nextInt();

        if (a>=(b+c) || b>=(a+c) || c>=(a+b)) {
            System.out.print(TRIANGLE_NOT_EXISTS);
        } else {
            System.out.print(TRIANGLE_EXISTS);
        }
    }
}
