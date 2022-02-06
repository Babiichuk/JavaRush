package ua.javarush.additional;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

public class Max{

    // Find the peak element in the array
    static int findPeak(int arr[])
    {
int n= arr.length;
        // First or last element is peak element
        if (n == 1)
            return 0;
        if (arr[0] >= arr[1])
            return 0;
        if (arr[n - 1] >= arr[n - 2])
            return n - 1;

        // Check for every other element
        for(int i = 1; i < n - 1; i++)
        {

            // Check if the neighbors are smaller
            if (arr[i] >= arr[i - 1] &&
                    arr[i] >= arr[i + 1])
                return i;
        }
        return 0;
    }

    public static int[] removeLocalMaxima(int[] array){

        int[] tempArray = new int[array.length];

        int index = findPeak(array);

        for(int i=0;i<array.length;i++){
            tempArray[i]=array[i];
           }

        for(int i=0;i<array.length;i++){
            tempArray[i]=array[i];
        }


        ArrayList<Integer> listOfIndex =new ArrayList<>();
        listOfIndex.add(index);

        int[] resultArray = new int[array.length];

        return resultArray;
    }



    // Driver Code
    public static void main(String[] args)
    {
        int arr[] = {18, 1, 3, 6, 7, -5};

        System.out.print(Arrays.toString(removeLocalMaxima(arr)));
    }
}

