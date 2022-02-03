package ua.javarush.additional;

import java.util.Scanner;

public class FindMaxInSeq {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int max = number;
        while (number != 0) {

            number = scanner.nextInt();
            if (number> max & number !=0){
                max = number;
            }

        }
        System.out.println(max);

    }
}
