package D8;

import java.util.Stack;

public class Q394 {
    public static void main(String[] args) {
        String s = "3[a]2[bc]";
        System.out.println(decodeString(s) );
    }
    public static String decodeString(String s) {
        StringBuilder sb=new StringBuilder();
        Stack<Integer> stack=new Stack<>();
        Stack<StringBuilder> stack_StringBuilder=new Stack<>();

        int n=0;
        for(char c:s.toCharArray()){
            if(Character.isDigit(c)){
                n = n* 10 + (c-'0');
            }
            else if(c=='['){
                stack.push(n);
                n=0;
                stack_StringBuilder.push(sb);//In order to save the current progress before starting a new section inside square brackets
                sb = new StringBuilder();
            }
            else if(c==']'){
                int x=stack.pop();
                StringBuilder temp=sb;//a
                sb=stack_StringBuilder.pop();//initialize
                while(x-->0){    
                    sb.append(temp);//a a =>aaa
                }

            }
            else{
                sb.append(c);
            }
        }


        return sb.toString();
    }
}
