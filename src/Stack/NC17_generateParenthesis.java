package Stack;
import  java.util.*;
public class NC17_generateParenthesis {
    public static List<String> generateParenthesis(int n) {
       List<String> res = new ArrayList<>();
        if (n <= 0) return res;
        backtrack(res, new Stack<>(), new StringBuilder(), 0, 0, n);
        return res;
    }
    public static void backtrack(List<String> res , Stack<Character> stack,
                                 StringBuilder curr, int open , int close , int max){
        if (curr.length() == max*2){
            res.add(curr.toString());
            return;
        }
        if(open<max){
            stack.push('(');
            curr.append('(');
            backtrack(res, stack, curr, open+1, close,max);
            curr.deleteCharAt(curr.length()-1);
            stack.pop();
        }
        if(!stack.isEmpty() && close < open){
            stack.pop();
            curr.append(')');
            backtrack(res,stack,curr,open,close+1,max);
            curr.deleteCharAt(curr.length()-1);
            stack.push('(');
        }
    }
    public static void main(String[] args) {
        int n = 3; // Number of pairs
        List<String> combinations = generateParenthesis(n);
        System.out.println(combinations);
    }

}