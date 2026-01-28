package Stack;

import java.util.LinkedList;
import java.util.Queue;

public class UsingQueue_Implementation {
    static Queue<Integer> s = new LinkedList<>();

    static void push(int x){
        s.add(x);

        for(int i = 0; i < s.size() - 1; i++){
            s.add(s.remove());
        }
    }

    static int pop(){
        return s.remove();
    }

    static int top(){
        return s.peek();
    }

    static boolean isEmpty(){
        return s.isEmpty();
    }

    static void display(){
        System.out.print("Stack (top → bottom): ");
        for (int x : s) {
            System.out.print(x + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        push(1);
        push(2);
        push(3);
        push(4);
        push(5);
        display();
        System.out.println("Peek element is: "+top());
        System.out.println("Popped element is: "+pop());
        display();
    }
}
