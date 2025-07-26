package Arrays_2D;

import java.util.Scanner;

public class Add_2_matrices {
    static void add(int[][] m1, int r1, int c1, int[][] m2, int r2, int c2){
        if(r1!=r2 || c1!=c2){
            System.out.print("Addition not possible..!");
            return;
        }
        int[][] sum=new int[r1][c1];
        for(int i=0;i<r1;i++){
            for(int j=0;j<c1;j++){
                sum[i][j]=m1[i][j]+m2[i][j];
            }
        }
        printMatrix(sum);
    }

    static void printMatrix(int[][] matrix){
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.println(matrix[i][j]+" ");
            }
            System.out.println();

        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no. of rows and columns of the matrix 1:  ");
        int r1=sc.nextInt();
        int c1=sc.nextInt();
        int[][] m1=new int[r1][c1];
        System.out.println("Enter the matrix values: ");
        for(int i=0;i<r1;i++){
            for(int j=0;j<c1;j++){
                m1[i][j]=sc.nextInt();
            }
        }
        System.out.println("Enter the no. of rows and columns of the matrix 2:  ");
        int r2=sc.nextInt();
        int c2=sc.nextInt();
        int[][] m2=new int[r1][c1];
        System.out.println("Enter the matrix values: ");
        for(int i=0;i<r2;i++){
            for(int j=0;j<c2;j++){
                m2[i][j]=sc.nextInt();
            }
        }
        System.out.println("Matrix 1");
        printMatrix(m1);
        System.out.println("Matrix 2");
        printMatrix(m2);
        add(m1, r1, c1, m2, r2, c2);
    }
}
