package Sorting;

public class CountSort_using_PrefixSum {
    static int findMax(int[] arr){
        int max = Integer.MIN_VALUE;
        for (int j : arr) {
            if (j > max)
                max = j;
        }
        return max;
    }
    static void count_sort(int[] arr){
        int n = arr.length;
        int[] output = new int[n];
        int max = findMax(arr);
        int[] freq = new int[max+1];
        // Make frequency array
        for(int i = 0; i < n; i++){
            freq[arr[i]]++;
        }
        // Covert it to PrefixSum array
        for (int i = 1; i < freq.length; i++) {
            freq[i] += freq[i-1];
        }

        // Add elements in output array
        for (int i = n-1; i >= 0; i--) {
            int idx = freq[arr[i]] - 1;
            output[idx] = arr[i];
            freq[arr[i]]--;
        }
        for (int i = 0; i < n; i++) {
            arr[i] = output[i];
        }
        printArr(arr);

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

        System.out.println("Array after sorting (using Count Sort) : ");
        count_sort(arr);

    }
}
