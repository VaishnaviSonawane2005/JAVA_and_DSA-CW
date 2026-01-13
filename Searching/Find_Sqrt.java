package Searching;

import java.util.Scanner;

public class Find_Sqrt {
    static int find_sqrt(int x){
        int st = 0, end = x;
        int ans = -1;
        while(st <= end){
            int mid = st + (end - st) / 2;
            int val = mid * mid;   // use long to avoid overflow
            if(val == x)
                return mid;
            else if(val < x){
                ans = mid;
                st = mid + 1;
            }
            else
                end = mid - 1;
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no. to find its square root: ");
        int n = sc.nextInt();
        System.out.println("Sqrt is: "+ find_sqrt(n));
    }
}
