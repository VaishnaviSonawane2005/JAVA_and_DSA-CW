package StringBuilder_and_strings;

import java.util.Scanner;

public class ConvertCase_usingStr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = sc.nextLine();
        for (int i = 0; i < str.length(); i++) {
            boolean flag = true;
            int ch = str.charAt(i);
            if(ch == ' ') continue;
            int ascii = (int) ch;
            if(ascii >= 97) flag = false;

            if(flag) {
                ascii += 32;
                char convert = (char) ascii;
                str = str.substring(0, i) + convert + str.substring(i+1);
            }
            else{
                ascii -= 32;
                char convert = (char) ascii;
                str = str.substring(0, i) + convert + str.substring(i+1);
            }
        }
        System.out.println(str);
    }
}
