import java.util.Scanner;

public class Array_numrepeat_lastindex {

    static int LastPosOfNum(int[] arr, int num)
    {
        int index=-1;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==num)
                index=i;
        }
        return index;

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=5;
        int[] arr=new int[n];
        System.out.println("ENTER THE ELEMENTS:");
        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();
        }
        System.out.println("ENTER THE NUMBER:");
        int num=sc.nextInt();
        System.out.println("LAST OCCURANCE OF NUMBER "+num+" IS AT INDEX: "+LastPosOfNum(arr,num));

    }
}
