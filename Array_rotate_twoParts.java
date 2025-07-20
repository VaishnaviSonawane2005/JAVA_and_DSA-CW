import java.util.Scanner;

public class Array_rotate_twoParts {

    static void printArray(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
    static void swap(int[] arr,int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    static void reverse(int[] arr, int i, int j){
        while(i<j){
            swap(arr,i,j);
            i++;
            j--;
        }
    }
    static void rotateInPlace(int[] arr,int k){
        int n=arr.length;
        k=k%n;
        reverse(arr, 0,n-k-1);
        reverse(arr,n-k,n-1);
        reverse(arr,0,n-1);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER THE SIZE OF ARRAY: ");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("ENTER THE ELEMENTS OF ARRAY: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();
        }
        System.out.println("ENTER THE TIMES YOU WANT TO ROTATE AN ARRAY: ");
        int k=sc.nextInt();
        System.out.println("ORIGINAL ARRAY IS: ");
        printArray(arr);
        rotateInPlace(arr,k);
        System.out.println("\nARRAY AFTER ROTATION IS: ");
        printArray(arr);
    }
}
