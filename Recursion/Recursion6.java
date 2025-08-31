package Recursion;
import java.util.ArrayList;
import java.util.Scanner;

//Linear Search using Recursion

public class Recursion6 {
    static boolean linear_search(int[] arr, int n, int target, int idx){
        if(idx >= n) return false;
        if(arr[idx] == target) return true;
        return linear_search(arr, n, target, idx+1);
    }

    static int findIndex(int[] arr, int n, int target, int idx){
        if(idx >= n) return -1;
        if(arr[idx] == target) return idx;
        return findIndex(arr, n, target, idx+1);
    }

    static void findAllIndices(int[] arr, int n, int target, int idx){
        if(idx >= n) return;            //{1,2,2,5,8,2}
        if(arr[idx] == target)
            System.out.print(idx+" ");
        findAllIndices(arr, n, target, idx+1);
    }

    static ArrayList<Integer> allIndices(int[] arr, int n, int target, int idx) {
        if (idx >= n) {
            return new ArrayList<>();
        }
        ArrayList<Integer> list = new ArrayList<>();
        if (arr[idx] == target){
            list.add(idx);
        }
        ArrayList<Integer> smallans = allIndices(arr, n, target, idx+1);
        list.addAll(smallans);
        return list;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array length: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the Array elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the element to Search in array: ");
        int target = sc.nextInt();
        System.out.println(linear_search(arr, n, target, 0));
        System.out.println("Element is present at index "+ findIndex(arr, n, target, 0));
        System.out.println(target+" is present on indices: ");
        findAllIndices(arr, n, target, 0);
        System.out.println();
        System.out.println(target+" is present on indices: "+allIndices(arr, n, target, 0));
    }
}
