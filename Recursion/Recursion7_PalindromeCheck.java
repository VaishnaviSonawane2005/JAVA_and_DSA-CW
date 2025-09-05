package Recursion;

import java.util.Scanner;

public class Recursion7_PalindromeCheck {
    static String reverse(String s, int idx){
        if(idx == s.length()) return "";
        String SmallAns = reverse(s, idx+1);
        return SmallAns + s.charAt(idx);
    }

    static boolean pointercheck(String s, int l, int r){
        if (l >= r) return true;
        return (s.charAt(l) == s.charAt(r) && pointercheck(s, l+1, r-1));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String: ");
        String s = sc.nextLine();
        String rev = reverse(s, 0);
        if(rev.equals(s)) {
            System.out.printf("%s is a Palindrome.", s);
        }
        else {
            System.out.printf("%s is not a Palindrome", s);
        }

        System.out.println("\n"+pointercheck(s, 0, s.length()-1));
    }
}
