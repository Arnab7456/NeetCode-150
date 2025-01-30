package Stack;

import java.util.Stack;

public class main {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(10);
        stack.push(20);
        stack.push(30);
       int delete = stack.pop();
        System.out.println(delete);
        System.out.println(stack);
        int topElemenet = stack.peek();
        System.out.println(topElemenet);
        if (!stack.isEmpty()){
            System.out.println(stack.pop());
        }
    }

}
