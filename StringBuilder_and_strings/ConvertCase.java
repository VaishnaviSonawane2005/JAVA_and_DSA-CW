package StringBuilder_and_strings;

import java.util.Scanner;

public class ConvertCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String: ");
        StringBuilder s = new StringBuilder(sc.nextLine());
        System.out.println(s);
        //toggle
        // PHysiCs -> phYSIcS
        for (int i = 0; i < s.length(); i++){
            boolean flag = true;
            int ch = s.charAt(i);
            if(ch == ' ') continue;
            int ascii = (int) ch;
            if(ascii >= 97) flag = false;

            if(flag) {
                ascii += 32;
                char convert = (char) ascii;
                s.setCharAt(i, convert);
            }
            else{
                ascii -= 32;
                char convert = (char) ascii;
                s.setCharAt(i, convert);
            }
        }
        System.out.println(s);
    }
}
