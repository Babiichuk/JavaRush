package ua.javarush.level3;

import java.util.Scanner;

public class GoToArmy {

    public static void main(String[] args) {
        String militaryCommissar = ", явитесь в военкомат";
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        int age = scanner.nextInt();

        if (age>=18 & age<=28){
            System.out.print(name + militaryCommissar);
        }
    }

}
