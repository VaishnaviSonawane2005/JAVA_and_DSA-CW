import java.util.Arrays;
import java.util.Scanner;

public class Array_return_SmallestandLargestnums {

    static int[] Smallet_Biggest(int[]arr){
        Arrays.sort(arr);
        int[] ans={arr[0], arr[arr.length-1]};
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=7;
        int[] arr=new int[n];
        System.out.println("ENTER THE ELEMENTS:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int[] ans=Smallet_Biggest(arr);
        System.out.println("SMALLEST: "+ans[0]);
        System.out.println("SMALLEST: "+ans[1]);
    }
}
