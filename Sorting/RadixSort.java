package Sorting;

public class RadixSort {
    static int findMax(int[] arr){
        int max = Integer.MIN_VALUE;
        for (int j : arr) {
            if (j > max)
                max = j;
        }
        return max;
    }

    static void count_sort(int[] arr, int place){
        int n = arr.length;
        int[] output = new int[n];
        int[] freq = new int[10];
        // Make frequency array,  arr[i] = 105 then freq[5]++ if place = 1.
        for(int i = 0; i < arr.length; i++){
            freq[(arr[i]/place)%10]++;
        }
        // Covert it to PrefixSum array
        for (int i = 1; i < freq.length; i++) {
            freq[i] += freq[i-1];
        }

        // Add elements in output array
        for (int i = n-1; i >= 0; i--) {
            int idx = freq[(arr[i]/place)%10] - 1;
            output[idx] = arr[i];
            freq[(arr[i]/place)%10]--;
        }
        for (int i = 0; i < n; i++) {
            arr[i] = output[i];
        }


    }

    static void radixSort(int[] arr){
        int max = findMax(arr);
        // apply counting sort to sort elements based on place value
        for (int place = 1; max / place > 0; place *= 10){
            count_sort(arr, place);
        }
    }

    static void printArr(int[] arr){
        for (int i : arr)
            System.out.print(i + " ");
    }
    public static void main(String[] args) {
        int[] arr = {43, 453, 626, 894, 0, 3};
        System.out.println("Array before sorting: ");
        printArr(arr);
        System.out.println();
        radixSort(arr);
        System.out.println("Array after sorting (using Count Sort) : ");
        printArr(arr);

    }
}
