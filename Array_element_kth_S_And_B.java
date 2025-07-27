import java.util.Arrays;
import java.util.Scanner;

class kth_Largest_and_smallest{
     public int[] kth_largest(int[] arr,int k){
        Arrays.sort(arr);
        int[] ans={arr[k],arr[arr.length-(k+1)]};
        return ans;
    }
}
public class Array_element_kth_S_And_B {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=7;
        int[] arr=new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();
        }
        System.out.println("ENTER THE kth ELEMENT:");
         int k=sc.nextInt();
        kth_Largest_and_smallest obj=new kth_Largest_and_smallest();
        int[] ans=obj.kth_largest(arr,k);
        System.out.println("kth Smallest:"+ans[0]);
        System.out.println("kth Largest:"+ans[1]);
    }
}
