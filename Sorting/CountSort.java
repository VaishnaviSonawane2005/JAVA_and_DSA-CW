package Sorting;

public class CountSort {
    static int findMax(int[] arr){
        int max = Integer.MIN_VALUE;
        for (int j : arr) {
            if (j > max)
                max = j;
        }
        return max;
    }
    static void freqCount(int[] arr){
        int max = findMax(arr);
        int[] freq = new int[max+1];
        for (int i : arr){
            freq[i]++;
        }
        int k = 0;
        for(int i = 0; i < freq.length; i++){
            for(int j = 0; j < freq[i]; j++){
                arr[k++] = i;
            }
        }
    }

    static void printArr(int[] arr){
        for (int i : arr)
            System.out.print(i + " ");
    }
    public static void main(String[] args) {
        int[] arr = {5, 2, 4, 2, 1, 4, 3};
        System.out.println("Array before sorting: ");
        printArr(arr);
        System.out.println();
        freqCount(arr);
        System.out.println("Array after sorting (using Count Sort) : ");
        printArr(arr);

    }
}
