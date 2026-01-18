package StringBuilder_and_strings;

import java.util.Scanner;

public class Palindromic_substring {
    public static void main(String[] args) {

        // Method I
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String: ");
        StringBuilder str = new StringBuilder(sc.nextLine());
        String org = str.toString();
        String reversed = str.reverse().toString();
        if (org.equals(reversed))
            System.out.println("Palindrome");
        else
            System.out.println("Not a Palindrome");
    }
}
