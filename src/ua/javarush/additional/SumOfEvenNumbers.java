package ua.javarush.additional;

public class SumOfEvenNumbers {
    public static void main(String[] args) {
        int[] userArray = {2,3,4,5,6,7,8,9};
        System.out.println(sum(userArray));
    }

    public static int sum(int[] array) {
        int result = 0;
        if (array == null) {
            System.out.println(0);

        } else if (array.length == 0) {
            System.out.println(0);
        } else {

            for (int i : array) {
                if (i % 2 == 0) {
                    result = result + i;
                }

            }

            //  throw new UnsupportedOperationException();

        }

        return result;
    }
}
