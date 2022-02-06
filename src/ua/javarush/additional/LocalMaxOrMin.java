package ua.javarush.additional;
import java.util.*;
class LocalMaxOrMin{

    // Function to find all the local maxima
// and minima in the given array arr[]
    public static void findLocalMaximaMinima(int n,
                                             int[] arr)
    {

        // Empty vector to store points of
        // local maxima and minima
        Vector<Integer> mx = new Vector<Integer>();
        Vector<Integer> mn = new Vector<Integer>();

        // Checking whether the first point is
        // local maxima or minima or none
        if (arr[0] > arr[1])
            mx.add(0);

        else if (arr[0] < arr[1])
            mn.add(0);

        // Iterating over all points to check
        // local maxima and local minima
        for(int i = 1; i < n - 1; i++)
        {
            // Condition for local minima
            if ((arr[i - 1] > arr[i]) &&
                    (arr[i] < arr[i + 1]))
                mn.add(i);

                // Condition for local maxima
            else if ((arr[i - 1] < arr[i]) &&
                    (arr[i] > arr[i + 1]))
                mx.add(i);
        }

        // Checking whether the last point is
        // local maxima or minima or none
        if (arr[n - 1] > arr[n - 2])
            mx.add(n - 1);

        else if (arr[n - 1] < arr[n - 2])
            mn.add(n - 1);

        // Print all the local maxima and
        // local minima indexes stored
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

        if (mn.size() > 0)
        {
            System.out.print("Points of Local " +
                    "minima are : ");
            for(Integer a : mn)
                System.out.print(a + " ");
            System.out.println();
        }
        else
            System.out.println("There are no points of " +
                    "Local Maxima ");
    }

    // Driver code
    public static void main(String[] args)
    {
        int N = 9;

        // Given array arr[]
        int arr[] = { 10, 20, 15, 14, 13,
                25, 5, 4, 3 };

        // Function call
        findLocalMaximaMinima(N, arr);
    }
}
