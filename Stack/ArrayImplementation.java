package Stack;

import java.util.Stack;

public class ArrayImplementation {
    static int[] arr = new int[5];
    static int n = arr.length;
    static int top = 0;
    static void push(int x){
        if(isFull()) {
            System.out.println("Stack Overflow!!! - stack is full");
            return;
        }
        arr[top++] = x;
    }

    static int pop(){
        if(isEmpty()){
            System.out.println("Stack Underflow!!! - Nothing left to pop");
            return -1;
        }
        int t = arr[--top];
        arr[top] = 0;
        return t;
    }
    static int peek(){
        if(isEmpty()){
            System.out.println("Stack Underflow!!! - Nothing left at peek");
            return -1;
        }
        return arr[top - 1];
    }

    static void display(){
        if(isEmpty()){
            System.out.println("Stack is empty");
            return;
        }
        for(int i = 0; i < top; i++){
            System.out.print(arr[i]+" ");
        }
    }

    static boolean isEmpty(){
        return top == 0;
    }
    static boolean isFull(){
        return top == n;
    }

    public static void main(String[] args) {
        push(1);
        push(2);
        push(3);
        push(4);
        display();
        System.out.println("\nPeek: " + peek()); // 4
        System.out.println("Popped: " + pop()); // 4
        display();

    }
}
