package Arrays_2D;

import java.util.Scanner;

public class RectangleSum_Method_II {
    static int findSum(int[][] matrix, int l1, int r1, int l2, int r2){
        int sum=0;
        findPrefixSum(matrix);
        for (int i = l1; i <=l2 ; i++) {
            // r1 to r2 sum for row i
            if (r1>=1)
                sum+=matrix[i][r2]-matrix[i][r1-1];
            else
                sum+=matrix[i][r2];
        }
        return sum;
    }

    static void findPrefixSum(int[][] matrix){
        int r=matrix.length;
        int c=matrix[0].length;
        // traverse horizontally to calculate row-wise prefixSum
        for (int i = 0; i < r; i++) {
            for (int j = 1; j < c; j++) {
                matrix[i][j]+=matrix[i][j-1];
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no. of rows and columns of matrix: ");
        int r=sc.nextInt();
        int c=sc.nextInt();
        int[][] matrix=new int[r][c];
        int totalElements=r*c;
        System.out.println("Enter "+totalElements+" values: ");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                matrix[i][j]=sc.nextInt();
            }
        }
        System.out.println("Enter rectangle boundaries l1, r1, l2, r2: ");
        int l1=sc.nextInt();
        int r1=sc.nextInt();
        int l2=sc.nextInt();
        int r2=sc.nextInt();

        System.out.println("Rectangle Sum "+findSum(matrix,l1,r1,l2,r2));
    }
}
