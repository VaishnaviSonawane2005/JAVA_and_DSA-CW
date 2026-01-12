package Searching;

import java.util.Scanner;

public class BinarySearch {
    static boolean binary_search(int[] arr, int target){
        int low = 0, high = arr.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2; // avoids overflow
            if (arr[mid] == target) {
                return true;
            } else if (arr[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return false;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {2, 4, 6, 7, 8, 9, 13};
        System.out.println("Enter the element to search: ");
        int target = sc.nextInt();
        System.out.println(binary_search(arr, target));
    }
}
