import java.util.Scanner;

public class Array_Countnums_strictlygreaterthan_x {

    static int numsstrictlygreaterthanx(int[] arr,int x){
        int count=0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>x)
                count++;
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=7;
        int[] arr=new int[n];
        System.out.println("ENTER THE ELEMENTS:");
        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();
        }
        System.out.println("ENTER x:");
        int x=sc.nextInt();
        System.out.println("COUNT OF NUMBERS STRICTLY GREATER THAN x is: "+numsstrictlygreaterthanx(arr, x));
    }
}
