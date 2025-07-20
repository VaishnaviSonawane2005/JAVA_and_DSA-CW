import java.util.Scanner;

class Unique_Num_Find{
    public int Find(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if(arr[i]==arr[j]){
                    arr[i]=-1;
                    arr[j]=-1;
                }
            }
        }
        int ans=-1;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>0){
                ans=arr[i];
            }
        }
        return ans;
    }
}

public class Array_UniqueFind {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=7;
        int[] arr=new int[n];
        System.out.println("ENTER THE ARRAY ELEMENTS:");
        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();
        }
        Unique_Num_Find obj=new Unique_Num_Find();
        System.out.println("UNIQUE NUMBER IS: "+obj.Find(arr));
    }
}
