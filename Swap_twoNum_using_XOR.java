import java.util.Scanner;

public class Swap_twoNum_using_XOR {
    static void swap(int x,int y){
        x^=y;
        y^=x;
        x^=y;
        System.out.println("Numbers after Swapping:\n"+x+" "+y);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the two numbers:");
        int x=sc.nextInt();
        int y=sc.nextInt();
        swap(x,y);
    }
}
