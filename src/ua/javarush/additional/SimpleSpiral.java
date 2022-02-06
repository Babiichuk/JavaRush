package ua.javarush.additional;

import java.util.Scanner;

public class SimpleSpiral {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int rows = input.nextInt();
        int columns = input.nextInt();

        int[][] resultSpiral = new int[rows][columns];

        int intA = 1, intB;
        if (columns % 2 != 0)
            intB = (columns + 1) / 2;
        else {
            intB = columns / 2;
        }

        for (int i = 0; i < intB; i++) {
            //Left to right loop
            for (int j = i; j < columns - i - 1; j++) {
                resultSpiral[i][j] = intA;
                intA++;
            }

            //Top to bottom loop
            for (int k = i; k < rows - i - 1; k++) {
                resultSpiral[k][columns - i - 1] = intA;
                intA++;
            }

            //Right to left loop
            for (int L = columns - i - 1; L >= i; L--) {
                resultSpiral[rows - i - 1][L] = intA;
                intA++;
            }

            //Bottom-up loop
            for (int m = rows - i - 2; m > i; m--) {
                if (resultSpiral[m][i] == 0)
                    resultSpiral[m][i] = intA;
                else
                    break;
                intA++;
            }
        }

//        //The output array, because the single digit occupies less, it is prone to misalignment, so add spaces
//        for (int i = 0; i < rows; i++) {
//            for (int j = 0; j < columns; j++) {
//                if (resultSpiral[i][j] <= 9)
//                    System.out.print(" " + resultSpiral[i][j] + " ");
//                else
//                    System.out.print(resultSpiral[i][j] + " ");
//            }
//            System.out.println();
//        }
    }
}

