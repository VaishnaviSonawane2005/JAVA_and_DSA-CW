package Stack;

import java.util.Scanner;
import java.util.Stack;

public class Match_RoundParenthesis {
    static Stack<Character> st = new Stack<>();
    static boolean matching(String str){
        int n = str.length();
        for(int i = 0; i < n; i++){
            if(str.charAt(i) == '('){
                st.push(str.charAt(i));
            }
            else{
                if(st.isEmpty()) return false;
                if(st.peek() == '(') st.pop();
            }
        }
        return st.isEmpty();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = sc.nextLine();
        System.out.println(matching(str));
    }
}
