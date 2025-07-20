import java.util.Scanner;

public class Array2D_Transpose {

    static void printMatrix(int[][] ans){
        for (int i = 0; i < ans.length; i++) {
            for (int j = 0; j < ans[i].length; j++) {
                System.out.print(ans[i][j]+" ");
            }
            System.out.println();
        }
    }

    static void findTranspose(int[][] a, int r, int c){
        int[][] ans=new int[c][r];

        for (int i = 0; i < c; i++) {
            for (int j = 0; j < r; j++) {
                ans[i][j]=a[j][i];
            }
        }
        System.out.println("Transpose of given Matrix is:");
        printMatrix(ans);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no. of rows and columns of Matrix:");
        int r= sc.nextInt();
        int c= sc.nextInt();
        int[][] a=new int[r][c];
        System.out.println("Enter the 2 Dimensional Array having "+r*c+" elements of Martix 1:");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                a[i][j]= sc.nextInt();
            }
        }
        findTranspose(a,r,c);

    }
}
