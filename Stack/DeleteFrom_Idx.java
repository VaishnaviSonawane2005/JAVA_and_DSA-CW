package Stack;

import java.util.Stack;

public class DeleteFrom_Idx {
    static void delete_from_idx(Stack<Integer> s,int idx) {
        if(s.size() == idx){
            s.pop();
            return;
        }
        int top = s.pop();
        delete_from_idx(s, idx);
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
        delete_from_idx(s, idx);    // Considered 0 based indexing

        System.out.println("Stack with deletion at index = "+ idx +" is :\n" + s);


    }
}


