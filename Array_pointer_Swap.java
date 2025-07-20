import java.util.Scanner;

public class Array_pointer_Swap {
    static void swap_pointers(int[] arr,int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    static void swapArray(int[] arr){
        int i=0,j=arr.length-1;
        while(i<=j){
            swap_pointers(arr,i,j);
            i++;
            j--;
        }
        System.out.println("SWAPPED ARRAY IS: ");
        for (int k = 0; k < arr.length; k++) {
            System.out.print(arr[k]+" ");
        }
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
        swapArray(arr);
    }
}
