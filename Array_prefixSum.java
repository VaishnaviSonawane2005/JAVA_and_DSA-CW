import java.util.Scanner;

public class Array_prefixSum {
    static void prefix(int[] arr){
        int[] pref=new int[arr.length];
        System.out.println("Prefix sum Array is:");
        pref[0]=arr[0];
        System.out.print(pref[0]+" ");
        for (int i = 1; i < arr.length; i++) {
            pref[i]=pref[i-1]+arr[i];
            System.out.print(pref[i]+" ");
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of Array:");
        int n= sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter the elements of array:");
        for (int i = 0; i < arr.length; i++) {
            arr[i]= sc.nextInt();
        }
        prefix(arr);
    }
}
