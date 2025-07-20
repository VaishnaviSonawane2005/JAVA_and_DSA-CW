import java.sql.SQLOutput;
import java.util.Scanner;

public class bitwiseOp {
    public static void main(String[] args) {
        Scanner read=new Scanner(System.in);
        System.out.println("ENTER A NUMBER:");
        int num=read.nextInt();
        System.out.println(num>>1);
    }
}
