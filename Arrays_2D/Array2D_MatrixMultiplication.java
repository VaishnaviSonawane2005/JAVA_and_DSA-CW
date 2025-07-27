package Arrays_2D;

import java.util.Scanner;

public class Array2D_MatrixMultiplication {

    static void printMatrix(int[][] sum){
        for (int i = 0; i < sum.length; i++) {
            for (int j = 0; j < sum[i].length; j++) {
                System.out.print(sum[i][j]+" ");
            }
            System.out.println();
        }
    }

    static void multiply(int[][] a, int r1, int c1, int[][] b, int r2, int c2){
        if(c1!=r2){
            System.out.println("Multiplication not possible - wrong dimension");
            return;
        }
        int[][] mul=new int[r1][c2];
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c2; j++) {
                for (int k = 0; k < c1; k++) {
                    mul[i][j]+=(a[i][k]*b[k][j]);
                }
            }
        }
        System.out.println("Multiplication of 2 matrices: ");
        printMatrix(mul);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no. of rows and columns of Matrix 1:");
        int r1= sc.nextInt();
        int c1= sc.nextInt();
        int[][] a=new int[r1][c1];
        System.out.println("Enter the 2 Dimensional Array having "+r1*c1+" elements of Martix 1:");
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c1; j++) {
                a[i][j]= sc.nextInt();
            }
        }
        System.out.println("Enter the no. of rows and columns of Matrix 2:");
        int r2= sc.nextInt();
        int c2= sc.nextInt();
        int[][] b=new int[r2][c2];
        System.out.println("Enter the 2 Dimensional Array having "+r2*c2+" elements of Martix 1:");
        for (int i = 0; i < r2; i++) {
            for (int j = 0; j < c2; j++) {
                b[i][j]= sc.nextInt();
            }
        }

        multiply(a, r1, c1, b, r2, c2);
    }
}
