package ua.javarush.level4;

public class FromOneToHundredWithGaps {
    public static void main(String[] args) {
        int n = 1;
        int rezult = 0;

        while (n<=100){
            if (n%3==0){
                n++;
                continue;
            } else {
        rezult = rezult+n;
        n++;
            }
        }
        System.out.println(rezult);
    }

}
