package Sorting;

public class Insertion {

    public static int[] insertion_sort(int[] arr) {
        
        int k = arr.length;
        for(int i=1;i<k;i++){
            int valueToSort = arr[i];
            int j; 
            // If we get smaller value than valueToSort then , we stop at that index. 
            for ( j = i; j > 0 && arr[j - 1] > valueToSort; j--) {
                arr[j] = arr[j - 1];
            }
            // We will put valueToSort at that index
            arr[j] = valueToSort;
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] output, input = { 2, 7, 3, 4, 1, 9, 4, 6, 7, 8, 5 };
        output = new int[11];
        output = insertion_sort(input);
        for (int i : output) {
            System.out.println(i);
        }
    }
}
