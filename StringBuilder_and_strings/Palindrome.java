package StringBuilder_and_strings;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {

        // Method I
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String: ");
        StringBuilder str = new StringBuilder(sc.nextLine());
        String org = str.toString();
        String reversed = str.reverse().toString();
        if(org.equals(reversed))
            System.out.println("Palindrome");
        else
            System.out.println("Not a Palindrome");


        // Method II
        int i = 0, j = str.length()-1;
        boolean flag = false;
        while(i <= j){
            if(str.charAt(i) != str.charAt(j)){
                flag = false;
                break;
            }
            else{
                i++;
                j--;
            }
            flag = true;
        }
        if(flag) System.out.println("Is a palindrome");
        else System.out.println("Is not palindrome");
    }
}
