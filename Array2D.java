import java.util.Scanner;

public class Array2D {
    static void printArray(int[][] arr){
        System.out.println("The Entered 2D Array is:");
        for (int i = 0; i < arr.length; i++) {       //row
            for (int j = 0; j < arr[i].length; j++) {    //column
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        /*
        int[][] arr2={{1,5,6},{7,9,11},{8,1,1}};
        printArray(arr2);
         */

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no. of rows:");
        int r= sc.nextInt();
        System.out.println("Enter the no. of columns:");
        int c= sc.nextInt();
        int[][] arr=new int[r][c];
        System.out.println("Enter the 2 Dimensional Array having "+r*c+" elements:");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                arr[i][j]= sc.nextInt();
            }
        }
        printArray(arr);
    }
}
