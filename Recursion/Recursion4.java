package Recursion;

import java.util.Scanner;

public class Recursion4 {
    static void num_multiples(int n, int k){
        if(k == 0){
            return;
        }
        num_multiples(n, k-1);
        System.out.print((n*k)+" ");
    }

    static int seriesSum(int n){
        if(n==1 || n==0) return n;
        return seriesSum(n-1) + n;
    }

    static int seriesSum_altSigns(int n){
        if(n==0) return n;
        if(n%2==0) return seriesSum_altSigns(n-1) - n;
        else return seriesSum_altSigns(n-1) + n;

    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number and k to print its k's multiples: ");
        int num=sc.nextInt();
        int k=sc.nextInt();
        num_multiples(num,k);

        System.out.println();
        System.out.println("Enter the number: ");
        int n=sc.nextInt();
        System.out.println(seriesSum(n));

        System.out.println(seriesSum_altSigns(n));
    }
}
