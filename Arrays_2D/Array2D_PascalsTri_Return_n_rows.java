package Arrays_2D;

import java.util.Scanner;

public class Array2D_PascalsTri_Return_n_rows {
    static void printMatrix(int[][] sum){
        for (int i = 0; i < sum.length; i++) {
            for (int j = 0; j < sum[i].length; j++) {
                System.out.print(sum[i][j]+" ");
            }
            System.out.println();
        }
    }
    static int[][] pascal(int n){
        int[][] ans=new int[n][];
        for(int i=0;i<n;i++){
            ans[i]=new int[i+1];
            ans[i][0]=ans[i][i]=1;

            for (int j = 1; j < i; j++) {
                ans[i][j]=ans[i-1][j]+ans[i-1][j-1];
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no. of rows: ");
        int n= sc.nextInt();
        int[][] ans=pascal(n);
        printMatrix(ans);
    }
}
