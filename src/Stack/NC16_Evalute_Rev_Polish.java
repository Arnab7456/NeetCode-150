package Stack;

import java.util.Stack;

public class NC16_Evalute_Rev_Polish {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        for(String Tokenstr : tokens){
            if (isOperator(Tokenstr)){
                int b = stack.pop();
                int a = stack.pop();
                int res = ApplyOperators(Tokenstr, a,b);
                stack.push(res);
            }else{
                stack.push(Integer.parseInt(Tokenstr));
            }
        }
        return stack.pop();
    }
    private boolean isOperator(String tokens){
        return tokens.equals("+") || tokens.equals("-") || tokens.equals("*") || tokens.equals("/");
    }
    private static int ApplyOperators(String operator , int a , int b){
        switch (operator){
            case "+" : return a+b;
            case  "-" : return  a-b;
            case "*" : return  a*b;
            case  "/" : return a/b;
            default:
                throw new IllegalArgumentException("Invalid operator: " + operator);
        }

    }
}
