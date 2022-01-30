package ua.javarush.level3;

import java.util.Scanner;

public class MaxOrMinOfFive {

    public static void main(String[] args) {
//        School variant
//        Scanner scanner = new Scanner(System.in);
//        int number = scanner.nextInt();
//        String result = number < 5 ? "число меньше 5" : number > 5 ? "число больше 5" : "число равно 5";
//        System.out.println(result);

//        My variant
          Scanner scanner = new Scanner(System.in);
          int number = scanner.nextInt();
          String result;
          if(number < 5){
              result =  "число меньше 5";
          } else if (number > 5){
              result =  "число больше 5";
          } else {
              result =  "число равно 5";
          }

            System.out.println(result);

    }
}
