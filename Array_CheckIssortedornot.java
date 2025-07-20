import java.util.Scanner;
public class Array_CheckIssortedornot {

    static boolean IsSorted(int[] arr){
        boolean check=true;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if(arr[i]>arr[j])         //not sorted
                {
                    check = false;
                    break;
                }
            }
        }
        return check;
    }

    /* static boolean IsSorted(int[] arr){
        boolean check=true;
        for (int i = 1; i < arr.length; i++) {
           if(arr[i]<arr[i-1])                        //not sorted
           {
                 check=false;
                 break;
           }
        }
        return check;
    }
    */

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=7;
        int[] arr=new int[n];
        System.out.println("ENTER THE ELEMENTS:");
        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();
        }
        System.out.println("IS SORTED? "+IsSorted(arr));
    }
}
