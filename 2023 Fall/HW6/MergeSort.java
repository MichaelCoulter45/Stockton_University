
public class MergeSort extends Main {
    public static int mscounter = 0;
    public void mergeSort(int[] arr) {
        if (arr.length > 1) {
            int mid = arr.length / 2;
            int[] left = new int[mid];
            int[] right = new int[arr.length - mid];
            for (int i = 0; i < mid; i++) {
                left[i] = arr[i];
            }// End of the for loop
            for (int i = mid; i < arr.length; i++) {
                right[i - mid] = arr[i];
            }// End of the for loop
            mergeSort(left);
            mergeSort(right);
            merge(arr, left, right);
            
        }// End of the if statement
    }// End of the merge Method
    public void merge(int[] arr, int[] left, int[] right) {
        int i = 0;
        int j = 0;
        int k = 0;
        while (i < left.length && j < right.length) {
            mscounter++;
            if (left[i] <= right[j]) {
                arr[k++] = left[i++];
            } else {
                arr[k++] = right[j++];
            }// End of the if else statement
        }// End of the while loop
        while (i < left.length) {
            arr[k++] = left[i++];
        }// End of the while loop
        while (j < right.length) {
            arr[k++] = right[j++];
        }// End of the while loop
    }// End of the merge Method
}//******** End of the Class *********



/*
Apply Merge Sort to the unsorted array. 
Create a counter to count the number of iteration needed to complete the sort of of the array.
 */