package ua.javarush.level4;

import java.util.Scanner;

public class SomebodyLovesMe {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        int n=0;
        String text = " любит меня.";

        while (n<10){
            System.out.println(name + text);
            n++;
        }

    }

}
