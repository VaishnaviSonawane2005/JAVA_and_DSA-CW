import java.util.Arrays;
import java.util.Scanner;
public class Arraypackage_use {

    static void print_array(int[] a)
    {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER THE SIZE OF ARRAY:");
        int n=sc.nextInt();
        int[] a=new int[n];
        System.out.println("ENTER THE ELEMENTS OF ARRAY:");
        for (int i=0;i<a.length;i++)
        {
            a[i]=sc.nextInt();
        }
        System.out.println("Elements are:");
        print_array(a);
        int[] a2= Arrays.copyOf(a, a.length);
        System.out.println("Copied arr2 is:");             //similar to clone()
        print_array(a2);

        int[] a3= Arrays.copyOfRange(a, 0, 4);
        System.out.println("Copied arr3 is:");             //start index:inclusive & end index:exclusive
        print_array(a3);
    }
}
