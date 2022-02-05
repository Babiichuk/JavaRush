package ua.javarush.additional;

public class MaxMethod {
    public static void main(String[] args) {
        int[] userArray = {-2, 4, 77, 32, 18};
        System.out.println(max(userArray));
    }

    public static int max(int[] values) {


        for (int i = 0; i < values.length - 1; i++) {
            int temp;
            if (values[i] > values[i + 1]) {
                temp = values[i];
                values[i] = values[i + 1];
                values[i + 1] = temp;

            }
        }

        return values[values.length - 1];


    }
    }


