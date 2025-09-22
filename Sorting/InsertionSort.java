package Sorting;

// Insertion Sort is a Stable & in-place Algorithm

public class InsertionSort {
    static void Insertion_Sort(int[] arr, int n){
        for (int i = 1; i < n; i++) {
            int j = i;
            while(j > 0 && arr[j] < arr[j-1]){
                //swap a[j], a[j-1]
                int temp = arr[j];
                arr[j] = arr[j-1];
                arr[j-1] = temp;
                j--;
            }
        }
    }
    static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static void main(String[] args) {
        int[] arr = {6, 1, 5, 9, 4, 0};
        Insertion_Sort(arr, arr.length);
        for (int x : arr){
            System.out.print(x + " ");
        }
    }
}
