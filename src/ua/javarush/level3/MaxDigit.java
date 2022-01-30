package ua.javarush.level3;

import java.util.Scanner;

public class MaxDigit {
    public static void main(String[] args) {

//        School variant

//        Scanner scanner = new Scanner(System.in);
//        int numberA = scanner.nextInt();
//        int numberB = scanner.nextInt();
//        if (numberA > numberB) {
//            System.out.println(numberA);
//        } else {
//            System.out.println(numberB);
//        }


//        My variant

        Scanner scanner = new Scanner(System.in);
        int numberA = scanner.nextInt();
        int numberB = scanner.nextInt();
        int max = (numberA > numberB)? numberA : numberB;
        System.out.println(max);


    }

}
