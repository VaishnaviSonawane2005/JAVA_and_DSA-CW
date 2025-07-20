import java.util.Scanner;
public class Array_PresenceOfNum_Given {

    static int[] makeFreq_Array(int[] arr){
        int[] freq=new int[100005];
        for (int i = 0; i < arr.length; i++) {
            freq[arr[i]]++;
        }
        return freq;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER THE ARRAY SIZE:");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("ENTER "+n+" ELEMENTS:");
        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();
        }
        int[] freq=makeFreq_Array(arr);
        System.out.println("ENTER NO. OF QUERIES:");
        int q=sc.nextInt();

        while(q>0){
            System.out.println("ENTER NUMBER TO BE SEARCHED: ");
            int x= sc.nextInt();
            if(freq[x]>0){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
            q--;
        }
    }
}
