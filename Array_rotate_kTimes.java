import java.util.Scanner;

public class Array_rotate_kTimes {
    static int[] rotate(int[] arr, int k){
        int n=arr.length;
        k=k%n;
        int[] ans=new int[n];
        int j=0;
        for (int i = n-k; i < n; i++) {
            ans[j++]=arr[i];
        }
        for (int i = 0; i < n-k; i++) {
            ans[j++]=arr[i];
        }
        return ans;
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
        int[] ans=rotate(arr,k);
        System.out.println("ARRAY AFTER "+k+" ROTATIONS: ");
        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i]+" ");
        }
        /* for (int an : ans) {
            System.out.print(an + " ");
        } */
    }
}
