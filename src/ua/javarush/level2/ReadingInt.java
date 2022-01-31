package ua.javarush.level2;

import java.util.Scanner;

public class ReadingInt {

    public static void main(String[] args) {
        // создаем объект класса Scanner для считывания с клавиатуры
        Scanner scanner = new Scanner(System.in);

        // объявляем переменную i1 типа int и присваиваем ей значение числа,
        // считанного с клавиатуры с помощью метода nextInt
        int i1 = scanner.nextInt();
        // объявляем переменную i2 типа int и присваиваем ей значение числа,
        // считанного с клавиатуры с помощью метода nextInt
        int i2 = scanner.nextInt();
        // объявляем переменную i3 типа int и присваиваем ей значение числа,
        // считанного с клавиатуры с помощью метода nextInt
        int i3 = scanner.nextInt();

        // выводим на экран значение - результат вычисления выражения
        // (i1 + i2 + i3) / 3
        System.out.println((i1 + i2 + i3) / 3);
    }

}
