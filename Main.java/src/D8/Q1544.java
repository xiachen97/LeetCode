package D8;

import java.util.Stack;

public class Q1544 {
    public static void main(String[] args) {
        String s="leEeetcode";
        System.out.println(makeGood(s));
    }
    public static String makeGood(String s) {
        Stack<Character> stack=new Stack<>();
        //int k='A'-'a';//-32 //Same char: UpperChar-LowerChar=-32 LowerChar-UpperChar = 32
        for(char c:s.toCharArray()){
            if(!stack.isEmpty() && (stack.peek()-c==32 || stack.peek()-c==-32)){
                stack.pop();
            }
            else{
                stack.push(c);
            }
        }
        String ans="";
        while(!stack.isEmpty()){
            ans=stack.pop()+ans;
        }
        return ans;
    }
}
