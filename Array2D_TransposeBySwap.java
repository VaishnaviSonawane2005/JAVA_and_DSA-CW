import java.util.Scanner;

public class Array2D_TransposeBySwap {
    static void printMatrix(int[][] a){
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
    }

    static void findTranspose(int[][] a, int r, int c){
        for (int i = 0; i < c; i++) {
            for (int j = i; j < r; j++) {
                int temp=a[i][j];
                a[i][j]=a[j][i];
                a[j][i]=temp;
            }
        }
        System.out.println("Transpose of given Matrix is:");
        printMatrix(a);
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
