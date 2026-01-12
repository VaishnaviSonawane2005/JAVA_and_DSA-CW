package Sorting.ProblemsSolving_2;

public class SortedArr_except_twoSwapped {
    static void sortArr(int[] arr){
        int x = -1, y = -1;
        for(int i = 1; i < arr.length; i++){
            if(arr[i-1] > arr[i]) {
                if(x == -1) {    // first conflict
                    x = i - 1;
                    y = i;
                }
                else {           // second conflict
                    y = i;
                }
            }
        }
        swap(arr, x, y);
    }

    static void swap(int[] arr, int x, int y){
        int temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;
    }

    public static void main(String[] args) {
        int[] arr = {3,8,6,7,5,9,10};    // Sorted in increasing order except two numbers : 8 and 5
        sortArr(arr);
        for(int val : arr){
            System.out.print(val+" ");
        }
    }
}
