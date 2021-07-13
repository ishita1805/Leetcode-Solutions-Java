package Sorting;
// import java.util.*;

public class Bubble {

    public static int[] bubble_sort(int[] arr) {
        
        int n = arr.length;
        for(int i=0;i<n;i++){
            for(int j=0;j<n-1-i;j++){
                // this inside 1 for loop makes sure that the largest 
                // element is at the end;
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        return arr;
    }
    public static void main(String[] args){
        int[] output, input = {2,7,3,4,1,9,4,6,7,8,5};
        output = new int[11];
        output = bubble_sort(input);
        for(int i: output){
            System.out.println(i);
        }
    }
}