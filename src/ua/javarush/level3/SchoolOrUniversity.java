package ua.javarush.level3;

import java.util.Scanner;

public class SchoolOrUniversity {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int age = scanner.nextInt();
        if (age < 18){
            {if (age >= 6)
                System.out.println("нужно ходить в школу");}
        }
        else
            System.out.println("пора в институт");
    }

}
