package Stack;

import java.util.Stack;

public class CopyStack {
    static void copystack(Stack<Integer> s){
        Stack<Integer> c1 = new Stack<>();
        System.out.println("Original stack is: ");
        System.out.print(s);
        while(s.size() != 0){
            c1.push(s.pop());
        }
        System.out.println("\nReversed stack: ");
        System.out.print(c1);

        Stack<Integer> c2 = new Stack<>();
        System.out.println("\nCopied stack is: ");
        while(c1.size() != 0){
            c2.push(c1.pop());
        }
        System.out.print(c2);
    }

    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(10);
        s.push(20);
        s.push(30);
        s.push(40);
        s.push(50);
        System.out.println(s.size());
        for(int i : s){
            System.out.print(i+" ");
        }
        System.out.println();

        copystack(s);

    }
}
