package Stack;

import java.util.Stack;

public class ReverseStack_Recursion {
    static void insert_at_bottom(Stack<Integer> s,int x) {
        if(s.isEmpty()){
            s.push(x);
            return;
        }
        int top = s.pop();
        insert_at_bottom(s, x);
        s.push(top);
    }

    static void reverse(Stack<Integer> s){
        if(s.isEmpty()){
            return;
        }
        int top = s.pop();
        reverse(s);
        insert_at_bottom(s, top);
    }
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(10);
        s.push(20);
        s.push(30);
        s.push(40);
        s.push(50);
        System.out.println("Original Stack: " + s);

        reverse(s);

        System.out.println("Reversed Stack: " + s);


    }
}

