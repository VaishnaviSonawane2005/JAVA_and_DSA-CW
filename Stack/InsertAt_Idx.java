package Stack;

import java.util.Stack;

public class InsertAt_Idx {
    static void insert_at_idx(Stack<Integer> s,int idx, int val) {
        if(s.size() == idx-1){
            s.push(val);
            return;
        }
        int top = s.pop();
        insert_at_idx(s, idx, val);
        s.push(top);
    }

    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(10);
        s.push(20);
        s.push(30);
        s.push(40);
        s.push(50);
        System.out.println("Original Stack: " + s);
        int idx = 2;
        int val = 100;
        insert_at_idx(s, idx, val);    // Considered 0 based indexing

        System.out.println("Stack with Insertion of " + val + " at index = "+ idx +" is :\n" + s);


    }
}

