package ua.javarush.level3;

import java.util.Scanner;

public class HotOrCold {

    public static void main(String[] args) {
        String cold = "на улице холодно";
        String warm = "на улице тепло";
        Scanner scanner = new Scanner(System.in);
        int temperature = scanner.nextInt();
        if (temperature<0){
            System.out.print(cold);
        } else {System.out.print(warm);

        }
    }
}


