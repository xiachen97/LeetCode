package D7;

import java.util.Stack;

public class Q1021 {
    public static void main(String[] args) {
        String s1 = "(()())(())";//"()()()"
        String s2 = "(()())(())(()(()))";//()()()()(())
        String s3 = "()()";//""
        System.out.println(removeOuterParentheses(s1));
        System.out.println(removeOuterParentheses(s2));
        System.out.println(removeOuterParentheses(s3));
    }
    public static String removeOuterParentheses(String s) {
        Stack<Character> stack=new Stack<>();
        StringBuilder sb=new StringBuilder();

        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('){
                if(stack.size()>0){
                    sb.append(s.charAt(i));
                }
                stack.push(s.charAt(i));
            }
            else{
                stack.pop();
                if(stack.size()>0){
                    sb.append(s.charAt(i));
                }
            }
        }


        return sb.toString();
        
    }
}
