package ua.javarush.level4;

public class Triangle {

    public static void main(String[] args) {

        int count =0;
        for (int i =0; i<8;i++){
            count = count+1;
            for (int j = 0; j<count; j++ ){
                System.out.print("8");
            }
            System.out.println();
        }
    }
}
