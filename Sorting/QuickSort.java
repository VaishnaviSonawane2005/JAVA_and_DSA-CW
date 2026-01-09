package Sorting;

public class QuickSort {
    static void quick_sort(int[] arr, int st, int end){
        if(st >= end)
            return;
        int pivot_Idx = partition(arr, st, end);
        quick_sort(arr, st, pivot_Idx - 1);
        quick_sort(arr, pivot_Idx + 1, end);
    }

    static int partition(int[] arr, int st, int end){
        int pivot = arr[st];
        int cnt = 0;
        for(int i = st+1; i <= end; i++){
            if(arr[i] <= pivot)
                cnt++;
        }
        int pivot_Idx = st + cnt;
        swap(arr, st, pivot_Idx);
        int i = st, j = end;
        while(i < pivot_Idx && j > pivot_Idx){
            while(arr[i] <= pivot) i++;
            while(arr[j] > pivot) j--;
            if(i < pivot_Idx && j > pivot_Idx){
                swap(arr, i, j);
                i++;
                j--;
            }
        }
        return pivot_Idx;
    }

    static void swap(int[] arr, int x, int y){
        int temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;
    }
    static void printArr(int[] arr){
        for (int num : arr)
            System.out.print(num + " ");
    }
    public static void main(String[] args) {
        int[] arr = {7, 4, 12, 8, 2, 10};
        System.out.println("Array before sorting: ");
        printArr(arr);
        quick_sort(arr, 0, arr.length-1);
        System.out.println();
        System.out.println("Array after sorting using Quick Sort: ");
        printArr(arr);
    }
}
