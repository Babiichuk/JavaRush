package ua.javarush.additional;
import java.util.*;
class GFG{

// Function to find all the local maxima in the given array array[]
    public static int[] findLIndexesOfLocalMaxima(int[] array)
    {
        int n = array.length;
        ArrayList<Integer> indexes = new ArrayList<>();
        ArrayList<Integer> withoutMaximas = new ArrayList<>();
        // Empty vector to store points of local maxima
        //Vector<Integer> mx = new Vector<Integer>();
         // Checking whether the first point is local maxima
        if (array[0] > array[1])
            indexes.add(0);
        // Iterating over all points to check local maxima
        for(int i = 1; i < n - 1; i++)
        {
        // Condition for local maxima
             if ((array[i - 1] < array[i]) &&
                    (array[i] > array[i + 1]))
                indexes.add(i);
        }
        // Checking whether the last point is local maxima
        if (array[n - 1] > array[n - 2])
            indexes.add(n - 1);

        // Print all the local maxima indexes stored
        if (indexes.size() > 0)
        {

            for(int i=0;i<array.length;i++){
                boolean flag = true;
                for(int j=0;j< indexes.size();j++){
                   if (i == indexes.get(j)){
                     flag =false;
                   }
                }
                if (flag){
                    withoutMaximas.add(array[i]);
                }else continue;

            }

            int [] result = new int[withoutMaximas.size()];
            for (int i=0; i< withoutMaximas.size();i++){
            result[i]=withoutMaximas.get(i);
         }
            return result;
        }
        else
//           If no maximas
            return array;

    }

    // Driver code
    public static void main(String[] args)
    {

        // Given array arr[]
        int arr[] = {18, 1, 3, 6, 7, -5};

        // Function call
        System.out.println(Arrays.toString(findLIndexesOfLocalMaxima(arr)));
    }
}
