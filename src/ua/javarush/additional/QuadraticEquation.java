package ua.javarush.additional;

import java.util.Scanner;

public class QuadraticEquation {

    public static void main(String[] args) {
        double a, b, c, x, x1,x2 ;
        Scanner scanner = new Scanner(System.in);
        a = scanner.nextDouble();
        b = scanner.nextDouble();
        c = scanner.nextDouble();

        double discriminant = b * b - 4 * a * c;


        if (discriminant > 0) {
            x1 = (-b - Math.sqrt(discriminant)) / (2 * a);
            x2 = (-b + Math.sqrt(discriminant)) / (2 * a);
            System.out.println(fmt(x1) + " " + fmt(x2));
        } else if (discriminant == 0) {
            x = -b / (2 * a);
            System.out.println(fmt(x));
        } else {
            System.out.println("no roots");
        }

    }

    public static String fmt(double d)
    {
        if(d == (long) d)
            return String.format("%d",(long)d);
        else
            return String.format("%s",d);
    }

}
