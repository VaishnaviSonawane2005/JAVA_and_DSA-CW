import java.util.Scanner;
class Swap{
    int count=0;
    void Count_0s(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                count++;
            }
        }
    }

    void printArray(int[] arr){
        for (int i=0;i<arr.length;i++) {
            if(i<count){
                arr[i]=0;
            }
            else{
                arr[i]=1;
            }
        }
        System.out.println("SORTED ARRAY IS:");
        for (int i : arr) {
            System.out.print(i+" ");
        }
        System.out.println();
    }
}
public class TwoPointers_count_0s_andSwap_1_0 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER THE SIZE OF ARRAY:");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("ENTER THE ELEMENTS OF THE ARRAY:");
        for (int i=0;i<arr.length;i++) {
            arr[i]=sc.nextInt();
        }
        Swap read=new Swap();
        read.Count_0s(arr);
        read.printArray(arr);
    }
}
