package Sorting;
import java.util.Random;

public class QuickSort_Hoare {
    static Random rand = new Random();

    static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pivotIndex = randomizedPartition(arr, low, high);
            quickSort(arr, low, pivotIndex);
            quickSort(arr, pivotIndex + 1, high);
        }
    }

    static int randomizedPartition(int[] arr, int low, int high) {
        // Pick a random pivot and swap with first element
        int pivotIndex = low + rand.nextInt(high - low + 1);
        swap(arr, low, pivotIndex);
        return hoarePartition(arr, low, high);
    }

    static int hoarePartition(int[] arr, int low, int high) {
        int pivot = arr[low];
        int i = low - 1;
        int j = high + 1;

        while (true) {
            do {
                i++;
            } while (arr[i] < pivot);

            do {
                j--;
            } while (arr[j] > pivot);

            if (i >= j)
                return j;

            swap(arr, i, j);
        }
    }

    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    static void printArr(int[] arr) {
        for (int num : arr)
            System.out.print(num + " ");
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = {7, 4, 12, 8, 2, 10};
        System.out.println("Array before sorting:");
        printArr(arr);

        quickSort(arr, 0, arr.length - 1);

        System.out.println("Array after sorting using QuickSort (Hoare + Random Pivot):");
        printArr(arr);
    }
}