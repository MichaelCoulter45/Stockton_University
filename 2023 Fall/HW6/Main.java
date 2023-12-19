import java.util.Arrays;
import java.util.Random;
public class Main {
    public static void main(String[] args) {
        int[] arr = new int[10000];// Array of size [x]
        int[] msArr = new int[arr.length];// Array of size 10
        Random rand = new Random();

        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextInt(100) + 1;
            msArr[i] = arr[i];
        }// Random numbers for the array.

        // Display the unsorted array
        System.out.println("Unsorted Array: " + Arrays.toString(msArr));
        System.out.println();
        // Apply Selection Sort to the unsorted array. Then display the sorted array.
        SelectionSort ss = new SelectionSort();
        ss.selectionSort(arr);
        System.out.println("Selection Sorted Array: " + Arrays.toString(arr));
        System.out.println("Selection Sort Iteration Counter: " + SelectionSort.sscounter);
        System.out.println();
        // Apply Merge Sort to the unsorted array. Then display the sorted array.
        MergeSort ms = new MergeSort();
        ms.mergeSort(msArr);
        System.out.println("Merge Sorted Array: " + Arrays.toString(msArr));
        System.out.println("Merge Sort Iteration Counter: " + MergeSort.mscounter);
        System.out.println();
    }// End of the Main Method
}//******** End of the Class ********* */





/*
Create an integer array of size of 10. 
Randomly populate the array  with integer from 1 to 100 into the array.
Apply Selection Sort to the unsorted array. 
Create a counter to count the number of iteration needed to complete the sort of of the array. 
Display the result of the array after the sort, and the counter.
Apply Merge Sort to the unsorted array. 
Create a counter to count the number of iteration needed to complete the sort of of the array. 
Display the result of the array after the sort, and the counter.
Repeat the above for an array of 10000 elements.
 */