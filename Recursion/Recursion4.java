package Recursion;
import java.util.Scanner;

//Finding GCD with 2 methods using Recursion

public class Recursion4 {

    //Brute-Force Approach
    static int GCD_I(int x, int y){
        if(x==0) return y;
        if(y==0) return x;
        if (x==y) return x;
        for(int i=Math.min(x,y); i>=1; i--){
            if(x%i==0 && y%i==0) return i;
        }
        return 1;
    }

    //Long-division Method
    static int GCD_II(int x, int y){
        if(y==0) return x;
        while(x % y != 0){
            int rem = x % y;
            x = y;
            y = rem;
        }
        return y;
    }

    //Euclid's Algorithm
    static int GCD_III(int x, int y){
        if (x == 0) return y;
        if (y == 0) return x;
        if (x == y) return x;
        return GCD_III(y, x % y);
    }


    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter two numbers whose GCD you want to find: ");
        int x=sc.nextInt();
        int y=sc.nextInt();
        System.out.println("GCD of " + x + " and " + y + " is: " + GCD_I(x, y));
        System.out.println("GCD of " + x + " and " + y + " is: " + GCD_II(x, y));
        System.out.println("GCD of " + x + " and " + y + " is: " + GCD_III(x, y));
    }
}


// LCM = (x * y) / GCD