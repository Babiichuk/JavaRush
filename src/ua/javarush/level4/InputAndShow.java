package ua.javarush.level4;

import java.util.Scanner;

public class InputAndShow {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while(true) {
            String userInput = scanner.nextLine();
            if (userInput.equals("enough")){
                break;
            } else {
                System.out.println(userInput);
            }
        }
    }

}
