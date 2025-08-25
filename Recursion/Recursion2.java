package Recursion;

import java.util.Scanner;

public class Recursion2 {
    static int SumOfDigits(int n){
        if(n >= 0 && n <= 9) return n;
        return SumOfDigits(n / 10) + n % 10;
    }

    static int power_I(int p, int q){
        if(q == 0) return 1;
        return p * power_I(p, q-1);
    }

    static int power_II(int p, int q){
        if(q == 0) return 1;
        int smallPow = power_II(p, q/2);
        if(q % 2 == 0){
            return smallPow * smallPow;
        }
        return p * smallPow * smallPow;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num=sc.nextInt();
        System.out.println("Sum of Digits are: "+SumOfDigits(num));

        System.out.println("Enter the two numbers: ");
        int p = sc.nextInt();
        int q = sc.nextInt();
        System.out.println("p power q by method I is: "+ power_I(p,q));

        System.out.println("p power q by Method II is: "+ power_II(p,q));
    }
}