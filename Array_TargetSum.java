import java.util.Scanner;
class SumOfTwonums{
    static int count=0;
    public int Twonums(int[] arr, int target){
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if(arr[i]+arr[j]==target){
                    count++;
                }
            }
        }
        return count;
    }
}
public class Array_TargetSum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=7;
        int[] arr=new int[n];
        System.out.println("ENTER THE ARRAY ELEMENTS:");
        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();
        }
        System.out.println("ENTER THE TARGET:");
        int target=sc.nextInt();
        SumOfTwonums obj=new SumOfTwonums();
        int total= obj.Twonums(arr,target);
        System.out.println("TOTAL PAIRS ARE: "+total);
    }
}
