package ua.javarush.level2;

public class StringToInt {

    public static void main(String[] args) {
        String bigAmount = "500";
        String greatAmount = "100000";

        int hugeAmount = Integer.parseInt(bigAmount)+Integer.parseInt(greatAmount);

        System.out.println(hugeAmount);
    }

}
