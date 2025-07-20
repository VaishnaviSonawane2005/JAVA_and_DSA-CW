import java.util.Scanner;

public class TwoPointers_Sort_MakingSquares {
    static void MakeSquare(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            arr[i]*=arr[i];
        }
    }
    static void ascending_sort(int[] arr,int i,int j){
        while(i<=j) {
            while(i++ <= j) {
                if (arr[i] >= arr[j]) {
                    swap(arr, i, j);
                }
                i++;
                j--;
            }
        }
        System.out.println("The Sorted array containing squares of numbers in ascending order is:");
        for ( i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
    static void swap(int[] arr, int a, int b){
        int temp=arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter the elements of array:");
        for (int i = 0; i < arr.length; i++) {
            arr[i]= sc.nextInt();;
        }
        int i=0, j=arr.length-1;
        MakeSquare(arr);
        ascending_sort(arr,i,j);
    }
}
