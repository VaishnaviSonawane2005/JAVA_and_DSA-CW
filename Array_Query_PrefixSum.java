import java.util.Scanner;

public class Array_Query_PrefixSum {
    static Scanner sc = new Scanner(System.in);

    static void QueryInput(int q, int[] arr){
        while(q-->0) {
            System.out.printf("Enter the %d Query: ", q);
            int l = sc.nextInt();
            int r = sc.nextInt();
            int ans=0;
            for (int i = l; i <= r; i++) {
                ans = ans + arr[i];
            }
            System.out.println("Sum is: "+ans);
        }
    }
    public static void main(String[] args) {
        System.out.println("Enter the number of Queries:");
        int q=sc.nextInt();
        System.out.println("Enter the size of Array:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of array:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        QueryInput(q, arr);

    }
}
