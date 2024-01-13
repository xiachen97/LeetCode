package D6;

import java.util.Stack;

public class stack {
    public static void main(String[] args) {
        Stack<Integer> stack=new Stack<>();
        
        stack.push(1);
        stack.push(5);
        stack.push(8);
        stack.push(11);
        print(stack);

        System.out.println("------pop------");
        System.out.println(stack.pop());
        System.out.println("------print------");
        print(stack);

        
        System.out.println("------peek------");
        System.out.println(stack.peek());
        System.out.println("------print------");
        print(stack);

    }
    public static void print(Stack<Integer> stack){
        // Because the Stack class inherits from Vector, and Vector is a dynamic array,
        // not a data structure specifically designed to implement stack operations.
        // so elements are not output in last-in-first-out (LIFO) order.
        for(int n:stack){
            System.out.println(n);
        }
    }
}
