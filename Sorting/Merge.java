package Sorting;

public class Merge {
    // recursive function
    public static void merge_sort(int arr[], int l, int h){
        if (h <= l) return;
        int m = (l+h)/2;

        merge_sort(arr, l, m);
        merge_sort(arr, m+1, h);
        merge(arr, l, m, h);
    }


    public static void merge(int array[], int low, int mid, int high){
        // Creating temporary subarrays
        int leftArray[] = new int[mid - low + 1];
        int rightArray[] = new int[high - mid];

        // Copying our subarrays into temporaries
        for (int i = 0; i < leftArray.length; i++)
        leftArray[i] = array[low + i];
        for (int i = 0; i < rightArray.length; i++)
            rightArray[i] = array[mid + i + 1];

         // Iterators containing current index of temp subarrays
        int leftIndex = 0;
        int rightIndex = 0;

        // Copying from leftArray and rightArray back into array
        for (int i = low; i < high + 1; i++) {
            // If there are still uncopied elements in R and L, copy minimum of the two
            if (leftIndex < leftArray.length && rightIndex < rightArray.length) {
                if (leftArray[leftIndex] < rightArray[rightIndex]) {
                   array[i] = leftArray[leftIndex];
                   leftIndex++;
                } else {
                    array[i] = rightArray[rightIndex];
                    rightIndex++;
                }
            } else if (leftIndex < leftArray.length) {
                // If all elements have been copied from rightArray, copy rest of leftArray
                array[i] = leftArray[leftIndex];
                leftIndex++;
            } else if (rightIndex < rightArray.length) {
                // If all elements have been copied from leftArray, copy rest of rightArray
                array[i] = rightArray[rightIndex];
                rightIndex++;
            }
        }
        
    }

    public static void main(String[] args){
        int[] input = { 2, 7, 3, 4, 1, 9, 4, 6, 7, 8, 5 };
        merge_sort(input, 0, input.length-1);
        for (int i : input) {
            System.out.println(i);
        }
    }
}
