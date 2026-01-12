package Searching;

import java.util.Scanner;

public class BinarySearch_Recursive {
    static boolean binary_search(int[] arr, int target, int low, int high){
        if(low > high) return false;
        int mid = low + (high - low) / 2; // avoids overflow
        if(arr[mid] == target)
            return true;
        else if(arr[mid] < target)
            return binary_search(arr, target, mid + 1, high);
        else
            return binary_search(arr, target, low, mid - 1);

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {2, 4, 6, 7, 8, 9, 13};
        System.out.println("Enter the element to search: ");
        int target = sc.nextInt();
        System.out.println(binary_search(arr, target, 0, arr.length-1));
    }
}
