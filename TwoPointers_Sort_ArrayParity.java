import java.util.Scanner;

public class TwoPointers_Sort_ArrayParity {
    static void EvenOdd(int[] arr) {
        int a = 0, b = arr.length-1;
        while (a < b) {
            if (arr[a] % 2 == 0 && arr[b] % 2 == 1) {
                swap(arr, a, b);
                a++;
                b--;
            }
            if (arr[a] % 2 == 1) {
                a++;
            }
            if (arr[b] % 2 == 0) {
                b--;
            }
        }
        printArray(arr);
    }
    static void swap(int[] arr, int a, int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

    static void printArray(int[] arr){
        System.out.println("Sorted Array is:");
        for (int value : arr) {
            System.out.print(value + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER THE SIZE OF ARRAY:");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("ENTER THE ELEMENTS OF THE ARRAY:");
        for (int i=0;i<arr.length;i++) {
            arr[i]=sc.nextInt();
        }
        EvenOdd(arr);

    }
}
