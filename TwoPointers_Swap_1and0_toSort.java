import java.util.Scanner;

public class TwoPointers_Swap_1and0_toSort {
    static void Arrange(int[] arr){
        int i=0, j=arr.length-1;
        for (int k = 0; k < arr.length; k++) {
            while(i<j){
                if(arr[i]==1 && arr[j]==0) {
                    swap(arr, i, j);
                    i++;
                    j--;
                }
                if(arr[i]==0)
                    i++;
                if(arr[j]==1)
                    j--;
            }
        }
        System.out.println("SORTED ARRAY IS:");
        for (int value : arr) {
            System.out.print(value + " ");
        }
    }

    static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER THE SIZE OF ARRAY:");
        int n=sc.nextInt();
        int[] arr =new int[n];
        System.out.println("ENTER THE ELEMENTS OF THE ARRAY:");
        for (int i=0;i<arr.length;i++) {
            arr[i]=sc.nextInt();
        }
        int i=0,j=arr.length-1;
        Arrange(arr);
    }
}
