package Sorting;

public class MergeSort {
    static void merge(int[] arr, int l, int mid, int r){
        int n1 = mid-l+1;
        int n2 = r - mid;
        int[] left = new int[n1];
        int[] right = new int[n2];
        int i, j, k;
        for (i = 0; i < n1; i++)
            left[i] = arr[l + i];
        for (j = 0; j < n2; j++)
            right[j] = arr[mid + 1 + j];
        i = 0;
        j = 0;
        k = l;
        while(i < n1 && j < n2){
            if(left[i] <= right[j])
                arr[k++] = left[i++];
            else
                arr[k++] = right[j++];
        }
        while(i < n1)
            arr[k++] = left[i++];
        while(j < n2)
            arr[k++] = right[j++];

    }

    static void divide_arr(int[] arr, int l, int r){
        int mid = (l + r) / 2;
        if(l >= r){
            return;
        }
        divide_arr(arr, l, mid);
        divide_arr(arr, mid+1, r);
        merge(arr, l, mid, r);
    }

    static int[] printArray(int[] arr){
        for (int n : arr){
            System.out.print(n+" ");
        }
        return arr;
    }
    public static void main(String[] args) {
        int[] arr = {6, 4, 2, 8, 9, 5};
        System.out.println("Array before sorting: ");
        printArray(arr);
        System.out.println();
        divide_arr(arr, 0, arr.length-1);
        System.out.println("Sorted Array using Merge Sort is: ");
        printArray(arr);
        
    }
}
