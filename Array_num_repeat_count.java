import java.sql.SQLOutput;
import java.util.Scanner;

public class Array_num_repeat_count {

    public static void main(String[] args) {
        int count=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER THE SIZE OF ARRAY:");
        int n=sc.nextInt();
        int[]arr=new int[n];
        System.out.println("ENTER THE ELEMENTS OF ARRAY:");
        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();
        }
        System.out.println("ENTER THE NUMBER:");
        int num=sc.nextInt();
        for (int j = 0; j < arr.length; j++) {
            if(arr[j]==num){
                count++;
            }
        }
        System.out.println("NUMBER COUNT IS:"+count);
    }
}
