import java.util.Scanner;
public class BinarytoDecimal {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER A BINARY NUMBER:");
        int Binary_num=sc.nextInt();

        int ans=0;
        int pw=1;

        while(Binary_num>0){
            int unit=Binary_num % 10;
            ans+=(unit * pw);
            Binary_num/=10;
            pw*=2;
        }
        System.out.println("Decimal no. is:"+ans);
    }
}
