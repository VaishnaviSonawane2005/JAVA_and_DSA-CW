package Lec_19_Arrays6;

import java.util.Scanner;

public class PrefixSum_usingNewArray {
    static int[] PrefixSum(int[] arr, int n){
        int pref[]=new int[n];
        pref[0]=arr[0];
        for(int i=1;i<n;i++){
            pref[i]=pref[i-1]+arr[i];
        }
        return pref;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of arr: ");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the elements of arr: ");
        for (int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int[] pref=PrefixSum(arr,n);
        System.out.println("Prefix Sum Array is: ");
        for (int i=0;i<n;i++){
            System.out.print(pref[i]+" ");
        }
    }
}
