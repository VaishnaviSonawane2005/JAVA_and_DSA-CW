import java.util.Scanner;
public class Array_Reverseorder {

    static void ReverseOrder(int[] arr){
        System.out.println("ARRAY REVERSE ORDER...");
        for (int i = arr.length-1; i >=0; i--) {
            System.out.print(arr[i]+"->");
        }
    }
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       int[] arr=new int[5];
        System.out.println("ENTER THE ELEMENTS OF ARRAY: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();
        }
        System.out.println("ORIGINAL ARRAY:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+"->");
        }
        System.out.println();
        ReverseOrder(arr);
    }
}
