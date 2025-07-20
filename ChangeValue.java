import java.util.Scanner;
public class ChangeValue {
    static void changenum(int a){
        a*=10;
        System.out.println("Number in the function operated..."+a);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number:");
        int a=sc.nextInt();
        System.out.println("Number before calling..."+a);
        changenum(a);
        System.out.println("Number after calling..."+a);
    }
}
