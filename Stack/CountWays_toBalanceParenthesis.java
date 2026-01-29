package Stack;

import java.util.Scanner;
import java.util.Stack;

public class CountWays_toBalanceParenthesis {
    static Stack<Character> st = new Stack<>();
    static int matching(String str){
        int n = str.length();
        int count = 0;
        for(int i = 0; i < n; i++){
            if(str.charAt(i) == '('){
                st.push(str.charAt(i));
            }
            else{
                if (st.isEmpty()) count++;
                else if(st.peek() == '(') st.pop();
            }
        }
        return st.size()+count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = sc.nextLine();
        System.out.println(matching(str));
    }
}
