package ua.javarush.level4;

import java.util.Scanner;

public class CokaSharing {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int cola = scanner.nextInt();
        int guys = scanner.nextInt();
        double result =cola*1.0/guys;
        System.out.println(result);
    }
}
