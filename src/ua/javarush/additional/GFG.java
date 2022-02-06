package ua.javarush.additional;
import java.util.*;
class GFG{

// Function to find all the local maxima in the given array arr[]
    public static void findLIndexesOfLocalMaxima(int[] arr)
    {
        int n = arr.length;
ArrayList<Integer> indexes =new ArrayList<>();
        // Empty vector to store points of local maxima
        Vector<Integer> mx = new Vector<Integer>();
         // Checking whether the first point is local maxima
        if (arr[0] > arr[1])
            mx.add(0);
        // Iterating over all points to check local maxima
        for(int i = 1; i < n - 1; i++)
        {
        // Condition for local maxima
             if ((arr[i - 1] < arr[i]) &&
                    (arr[i] > arr[i + 1]))
                mx.add(i);
        }
        // Checking whether the last point is local maxima
        if (arr[n - 1] > arr[n - 2])
            mx.add(n - 1);

        // Print all the local maxima indexes stored
        if (mx.size() > 0)
        {
            System.out.print("Points of Local " +
                    "maxima are : ");
            for(Integer a : mx)
                System.out.print(a + " ");
            System.out.println();
        }
        else
            System.out.println("There are no points " +
                    "of Local Maxima ");


    }

    // Driver code
    public static void main(String[] args)
    {


        // Given array arr[]
        int arr[] = {18, 1, 3, 6, 7, -5};

        // Function call
        findLIndexesOfLocalMaxima(arr);
    }
}
