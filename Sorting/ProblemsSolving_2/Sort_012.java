package Sorting.ProblemsSolving_2;

public class Sort_012 {
    static void sort_012(int[] arr){
        int lo = 0, mid = 0, hi = arr.length - 1;

        // explore the unknown region
        while(mid <= hi){
            if(arr[mid] == 0){
                swap(arr, mid, lo);
                mid++;
                lo++;
            }
            else if(arr[mid] == 1){
                mid++;
            }
            else{
                swap(arr, mid, hi);
                hi--;
            }
        }
    }

    static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    static void display(int[] arr){
        for (int val : arr)
            System.out.print(val + " ");
    }

    public static void main(String[] args) {
        int[] arr = {1, 1, 1, 2, 2, 0, 0, 1, 1, 2, 2, 0};
        System.out.println("Array before sorting: ");
        display(arr);
        System.out.println();
        System.out.println("Array after sorting: ");
        sort_012(arr);
        display(arr);
    }
}
