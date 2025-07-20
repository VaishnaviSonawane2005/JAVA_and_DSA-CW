import java.util.Scanner;
public class Rectangle{
    public static void main(String[] args) {
        Scanner read=new Scanner(System.in);
        System.out.println("Enter no. of rows:");
        int r=read.nextInt();
        System.out.println("Enter no. of columns:");
        int c=read.nextInt();
        for(int i=1;i<=r;i++)
        {
            for (int j = 1; j <=c; j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}