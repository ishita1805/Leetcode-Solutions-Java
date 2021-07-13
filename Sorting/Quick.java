package Sorting;

public class Quick {

    public static int partition(int a[], int l, int h){
        int pivot = a[h];
        int i = l-1;
        for(int j=l;j<h;j++){
            if(a[j]<=pivot) {
                i++;
                int temp = a[i];
                a[i] = a[j] ;
                a[j] = temp;
            }
        }
        int temp = a[i+1];
        a[i+1] = a[h] ;
        a[h] = temp;
        return i+1;
    }

    public static void quick_sort(int a[], int l, int h){
        if(l<h){
            int i = partition(a, l, h);
            quick_sort(a, l, i-1);
            quick_sort(a, i+1, h);
        }
    }

    public static void main(String[] args){
        int[] input = { 2, 7, 3, 4, 1, 9, 4, 6, 7, 8, 5 };
        int length = input.length-1;
        quick_sort(input, 0, length);
        for (int i : input) {
            System.out.println(i);
        }
    }  
}
