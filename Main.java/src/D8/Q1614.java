package D8;

import java.util.Stack;

public class Q1614 {
    public static void main(String[] args) {
        String s="(1+(2*3)+((8)/4))+1";
        System.out.println(maxDepth(s));
    }
    public static int maxDepth(String s) {
        //1.
        int count=0;///count cur dept of "()"
        int max_value=0;//count max dept of "()"
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('){
                count++;
            }
            else if(s.charAt(i)==')'){
                count--;
            }
            max_value=Math.max(max_value, count);
        }
        return max_value;

        //2
        // Stack<Character> stack=new Stack<>();
        // int max=0;
        // for(int i=0;i<s.length();i++){
        //     if(s.charAt(i)=='('){
        //         stack.push('(');
        //     }
        //     else if(s.charAt(i)==')'){
        //         stack.pop();
        //     }
        //     max=Math.max(max, stack.size());
        // }
        // return max;

    }
}
