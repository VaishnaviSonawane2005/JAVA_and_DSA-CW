import java.util.Scanner;

public class Array_Second_Maximum {
    public int find_max(int[] arr) {
        int max = Integer.MIN_VALUE;  // Moved max here to avoid it being shared across calls
        for (int j : arr) {
            if (j > max) {
                max = j;
            }
        }
        return max;
    }

    public void find_second_max(int[] arr) {
        int max = find_max(arr);
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == max) {
                arr[i] = Integer.MIN_VALUE;
            }
        }
        int second_max = find_max(arr);
        System.out.println("SECOND MAX NUMBER IS: " + second_max);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 7;
        int[] arr = new int[n];
        System.out.println("ENTER THE ARRAY ELEMENTS:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        Array_Second_Maximum obj = new Array_Second_Maximum();  // Moved outside the loop
        obj.find_second_max(arr);
    }
}
