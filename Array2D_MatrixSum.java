import java.util.Scanner;

public class Array2D_MatrixSum {
    static void printMatrix(int[][] sum){
        for (int i = 0; i < sum.length; i++) {
            for (int j = 0; j < sum[i].length; j++) {
                System.out.print(sum[i][j]+" ");
            }
            System.out.println();
        }
    }
    static void add(int[][] a, int r1, int c1, int[][] b, int r2, int c2){
        if(r1!=r2 || c1!=c2){
            System.out.println("Wrong Input - Addition not Possible...");
            return;
        }
        int[][] sum=new int[r1][c1];
        for (int i = 0; i < r1; i++) {      //row number
            for (int j = 0; j < c1; j++) {   //column number
                sum[i][j]=a[i][j]+b[i][j];
            }
        }
        System.out.println("Sum of Matrix 1 and Matrix 2 is:");
        printMatrix(sum);

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
        System.out.println("Matrix 1 is:");
        printMatrix(a);
        System.out.println("Matrix 2 is:");
        printMatrix(b);

        add(a, r1, c1, b, r2, c2);
    }
}
