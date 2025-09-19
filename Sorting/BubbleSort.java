package Sorting;

public class BubbleSort {
    static int[] Bubble_Sort(int[] arr, int n){
        for (int i = 0; i < n - 1; i++) {
            for (int j = 1; j < n - i; j++) {
                if(arr[j - 1] > arr[j]){
                    swap(arr, j - 1, j);
                }
            }
        }
        return arr;
    }

    static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        int[] arr = {6, 1, 5, 9, 4, 0};
        Bubble_Sort(arr, arr.length);
        for (int x : arr){
            System.out.print(x + " ");
        }
    }
}
