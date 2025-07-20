import java.util.Scanner;

public class Array2D_Rotate_SqMatrix_90de {
    static void printMatrix(int[][] a){
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
    }

    static void findTranspose(int[][] a, int r, int c){
        int[][] ans=new int[r][c];
        for (int i = 0; i < c; i++) {
            for (int j = 0; j < r; j++) {
                ans[i][j]=a[j][i];
            }
        }
    }

    static void ReverseArray(int[] arr){
        int i=0, j=arr.length-1;
        while(i<j){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
    }

    static void Rotate(int[][] a, int n){
        //Transpose
        findTranspose(a,n,n);
        //Reverse each row of Transposed matrix
        for (int i = 0; i < n; i++) {
           ReverseArray(a[i]);
        }
        System.out.println("90 Degree Transpose of given Matrix is:");
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
        Rotate(a,r);

    }
}
