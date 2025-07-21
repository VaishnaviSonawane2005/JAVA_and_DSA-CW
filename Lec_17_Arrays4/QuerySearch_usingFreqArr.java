package Lec_17_Arrays4;

import java.util.Scanner;

public class QuerySearch_usingFreqArr {

    static int[] MakeFreq_Array(int[] arr, int q){
        int[] freq=new int[100005];
        for(int i=0;i<arr.length;i++){
            freq[arr[i]]++;
        }
        return freq;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of arr: ");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the elements of arr" + ": ");
        for (int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the no. of queries to Search: ");
        int q=sc.nextInt();
        int[] freq=MakeFreq_Array(arr, q);
        while(q>0){
            System.out.println("Enter no. to be searched: ");
            int x=sc.nextInt();
            if(freq[x]>0)
                System.out.println("YES");
            else
                System.out.println("NO");
            q--;
        }
    }
}
