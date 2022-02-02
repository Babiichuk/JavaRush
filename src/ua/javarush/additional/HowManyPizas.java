package ua.javarush.additional;

import java.sql.SQLOutput;
import java.util.Scanner;

public class HowManyPizas {

    public static void main(String[] args) {
        int personQuantity=0;
        int pizzaSlices =0;

        int counter =1;
        Scanner scanner = new Scanner(System.in);
        personQuantity = scanner.nextInt();
        pizzaSlices = scanner.nextInt();
        int temp = pizzaSlices;


        while (temp%personQuantity !=0){
           temp = temp + pizzaSlices;
           counter++;

        }

        System.out.println(counter);
    }

}
