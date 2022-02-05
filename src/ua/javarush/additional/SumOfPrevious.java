package ua.javarush.additional;

public class SumOfPrevious {

    public static void main(String[] args) {
        int[] userArray = {2,3,5,5,6,7,8,15};
        for (int i=0; i<getSumCheckArray(userArray).length-2; i++) {
            System.out.print(getSumCheckArray(userArray)[i]+", ");
        }
        System.out.print(getSumCheckArray(userArray)[getSumCheckArray(userArray).length-1]);

    }
    public static  boolean[] getSumCheckArray(int[] array){
        boolean[] result = new boolean[array.length];
        result[0] = false;
        result[1]= false;
        for (int i=2; i<result.length; i++ ){
            if (array[i] == array[i-1]+array[i-2]){
                result[i] = true;
            }else{
                result[i] = false;
            }
        }

      return result;
    }

}
