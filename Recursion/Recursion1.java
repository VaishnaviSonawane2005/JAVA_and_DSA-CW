package Recursion;

import java.util.Scanner;

public class Recursion1 {
    static void fibonacci(int n, int a, int b){
        if(n == 0) return;
        System.out.print(a+" ");
        fibonacci(n-1, b, a+b);
    }

    static int nth_fibonacci(int n){
        if(n==0) return 0;
        if(n==1) return 1;
        return nth_fibonacci(n-1) + nth_fibonacci(n-2);
    }

    static int factorial(int n){
        if(n == 1) return 1;
        if(n <= 0) return -1;
        return n * factorial(n-1);
    }

    static void recursion_increasing(int n){
        if(n==1){
            System.out.print(n+" ");
            return;
        }
        recursion_increasing(n-1);
        System.out.print(n+" ");
    }

    static void recursion_decreasing(int n){
        if(n == 1){
            System.out.print(n+" ");
            return;
        }
        System.out.print(n+" ");
        recursion_decreasing(n-1);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number till which you have to print numbers: ");
        int n = sc.nextInt();
        System.out.println("In increasing format: ");
        recursion_increasing(n);
        System.out.println("\nIn decreasing format: ");
        recursion_decreasing(n);
        System.out.println("\nFactorial of given number is: "+factorial(n));

        System.out.println("Fibonacci series:");
        fibonacci(n, 0, 1);

        System.out.println("\nFibonacci series upto "+n+" count is: "+nth_fibonacci(n));
    }
}
