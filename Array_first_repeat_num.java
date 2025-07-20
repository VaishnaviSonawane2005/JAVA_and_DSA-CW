import java.util.Scanner;
public class Array_first_repeat_num {
    static int first_repeat(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if(arr[i]==arr[j]){
                    return arr[i];
                }
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 7;
        int[] arr = new int[n];
        System.out.println("ENTER THE ARRAY ELEMENTS:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int ans=first_repeat(arr);
        System.out.println(ans);
    }
}
