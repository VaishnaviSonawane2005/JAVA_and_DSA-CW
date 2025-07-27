package Arrays_2D;

import java.util.Scanner;

public class Print_Spiral_Order {
    static void printMatrix(int[][] sum){
        for (int i = 0; i < sum.length; i++) {
            for (int j = 0; j < sum[i].length; j++) {
                System.out.print(sum[i][j]+" ");
            }
            System.out.println();
        }
    }

    static void printSpiralOrder(int[][] a, int r, int c){
        int topRow=0, bottomRow=r-1, leftCol=0, rightCol=c-1;
        int totalElements=0;

        while(totalElements < r * c){
            // top row -> leftCol to rightCol
            for (int j = leftCol; j <= rightCol; j++) {
                System.out.print(a[topRow][j]+" ");
                totalElements++;
            }
            topRow++;

            // right col-> topRow to BottomRow
            for (int i = topRow; i <= bottomRow; i++) {
                System.out.print(a[i][rightCol]+" ");
                totalElements++;
            }
            rightCol--;

            // bottom row-> rightCol to leftCol
            for (int j = rightCol; j >= leftCol ; j--) {
                System.out.print(a[bottomRow][j]+" ");
                totalElements++;
            }
            bottomRow--;

            // leftCol-> bottomRow to topRow
            for (int i = bottomRow; i >= topRow; i--) {
                System.out.print(a[i][leftCol]+" ");
                totalElements++;
            }
            leftCol++;
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no. of rows and columns of Matrix:");
        int r= sc.nextInt();
        int c= sc.nextInt();
        int[][] a=new int[r][c];
        System.out.println("Enter the 2 Dimensional Array having "+r*c+" elements of Matrix:");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                a[i][j]= sc.nextInt();
            }
        }
        System.out.println("Input Matrix");
        printMatrix(a);

        System.out.println("Spiral Order is: ");
        printSpiralOrder(a, r, c);
    }
}
