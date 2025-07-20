import java.sql.SQLOutput;
import java.util.Scanner;

class Algebra{
    int add(int a,int b){
        return a+b;
    }
    int sub(int a,int b) {
        return a-b;
    }
    int product(int a,int b) {
        return a*b;
    }
    int divide(int a,int b) {
        return a/b;
    }
}

public class Methods {
    public static void main(String[] args) {
        Algebra read=new Algebra();
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER TWO NUMBERS:");
        int i=sc.nextInt();
        int j=sc.nextInt();
        System.out.println("SUM OF INPUT NUMBERS IS:"+read.add(i,j));
        System.out.println("DIFFERENCE OF INPUT NUMBERS IS:"+read.sub(i,j));
        System.out.println("PRODUCT OF INPUT NUMBERS IS:"+read.product(i,j));
        System.out.println("DIVISION OF INPUT NUMBERS IS:"+read.divide(i,j));


    }
}
