
public class SelectionSort extends Main {
    public static int sscounter = 0;
    public void selectionSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n-1; i++) {
            int minIndex = i;
            for (int j = i+1; j < n; j++) {
                sscounter++;
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                    
                }// End of the if statement
            }// End of the inner for loop
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }// End of the outer for loop
    }// End of the selectionSort Method
}//******** End of the Class *********

/*
 * Apply Selection Sort to the unsorted array. Create a counter to count the number of iteration needed to complete the sort of of the array. 
 */
