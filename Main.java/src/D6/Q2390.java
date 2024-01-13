package D6;

import java.util.Stack;

public class Q2390 {
    public static void main(String[] args) {
        String s = "leet**cod*e";
        System.out.println(removeStars(s));
    }
    public static String removeStars(String s) {
        //1.StringBuilder
        StringBuilder sb=new StringBuilder();
        for(char c:s.toCharArray()){
            if(c!='*'){
                sb.append(c);
            }
            else{
                sb.deleteCharAt(sb.length()-1);
            }
        }
        return sb.toString();

        //2. StringBuilder +Stack
        // Stack<Character> stack=new Stack<>();
        // for(char c:s.toCharArray()){        
        //     if(c=='*'){
        //         stack.pop();
        //     }
        //     else{
        //         stack.push(c);
        //     }
        // }
        // StringBuilder sb=new StringBuilder();
        // for(char c:stack){
        //     sb.append(c);
        // }
        // return sb.toString();
    }
}
