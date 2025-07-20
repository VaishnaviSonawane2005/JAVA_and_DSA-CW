import java.util.Scanner;

public class Array_prefixSum_SameArray {
    static void PrefixSum(int[] arr){
        for (int i = 1; i < arr.length; i++) {
            arr[i]=arr[i-1]+arr[i];
        }
        System.out.println("Prefix Sum Array is:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of Array:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of array:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        PrefixSum(arr);
    }
}
