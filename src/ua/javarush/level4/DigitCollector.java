package ua.javarush.level4;

import java.util.Scanner;

public class DigitCollector {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = 0;
        String keyPhrase = "enter";
        boolean isFinish = false;
        while (!isFinish){
            String input = scanner.nextLine();
            if(input.equalsIgnoreCase(keyPhrase)){
                System.out.println(number);
                isFinish = true;
                } else {
                number = number+Integer.parseInt(input.trim());
            }
        }
    }
}
