package StringBuilder_and_strings;

import java.util.Scanner;

public class Reverse_words_in_sentence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the sentence: ");
        String sen = sc.nextLine();
        String ans = "";
        StringBuilder s = new StringBuilder("");
        for (int i = 0; i < sen.length(); i++) {
            char ch = sen.charAt(i);
            if(ch != ' ')
                s.append(ch);
            else{
                s.reverse();
                ans += s;
                ans += " ";
                s.delete(0, s.length());
            }
        }
        s.reverse();
        ans += s;
        System.out.println(ans);
    }
}
