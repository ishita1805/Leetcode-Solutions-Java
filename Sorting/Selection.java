package Sorting;

public class Selection {
    public static int[] selection_sort(int arr[]){
        
        for (int i = 0; i < arr.length - 1; i++)
        {
            int index = i;
            for (int j = i + 1; j < arr.length; j++)
                if (arr[j] < arr[index]) index = j;
                if(index != i){
                    int smallerNumber = arr[index]; 
                    arr[index] = arr[i];
                    arr[i] = smallerNumber;
                }
        }
        return arr;
    }

    public static void main(String[] args){
        int[] output, input = { 2, 7, 3, 4, 1, 9, 4, 6, 7, 8, 5 };
        output = new int[11];
        output = selection_sort(input);
        for (int i : output) {
            System.out.println(i);
        }
    }
}
