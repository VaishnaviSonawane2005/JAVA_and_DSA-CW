package Sorting.ProblemsSolving_2;

public class Sort_positive_negative_int {
    static void sortArr(int[] arr){
        int l = 0, r = arr.length - 1;
        while(l <= r){
            if(arr[l] > 0 && arr[r] < 0) {
                swap(arr, l, r);
                l++;
                r--;
            }
            else if(arr[l] < 0) l++;
            else if(arr[r] >= 0) r--;
        }
    }
    static void swap(int[] arr, int l, int r){
        int temp = arr[l];
        arr[l] = arr[r];
        arr[r] = temp;
    }
    public static void main(String[] args) {
        int[] arr = {19, -20, 7, -4, -13, 11, -5, 3};
        sortArr(arr);
        for (int val : arr)
            System.out.print(val+" ");
    }
}
