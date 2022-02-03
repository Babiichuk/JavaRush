package ua.javarush.additional;

import java.util.Scanner;

public class GoDutch {
    public static void main(String[] args) {

        int tipsPercent = 10;
        int quantityOfTips;

        Scanner scanner = new Scanner(System.in);
        int billTotalAmount = scanner.nextInt();

        if (billTotalAmount > 0) {
            quantityOfTips = billTotalAmount / 100 * tipsPercent;
            billTotalAmount = billTotalAmount + quantityOfTips;
        } else if (billTotalAmount < 0) {
            System.out.println("Bill total amount cannot be negative");
        }

        int quantityOfFriends = scanner.nextInt();
        if (quantityOfFriends > 0) {
            int pieceOfBillForOnePersone;
            System.out.println(pieceOfBillForOnePersone = billTotalAmount / quantityOfFriends);
        } else if (quantityOfFriends <= 0) {
            System.out.println("Number of friends cannot be negative or zero");
        }

    }
}
