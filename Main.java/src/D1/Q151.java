/*Note: 
1. use trim() to remove space from begin and end;
2. use split to change string to array
*/

package D1;

public class Q151 {
    public static void main(String[] args){
        String s = "the sky is blue";
        String s1 = "  hello world  ";
        String s2 = "a good   example";
        System.out.println(reverseWords(s));
        System.out.println(reverseWords(s1));
        System.out.println(reverseWords(s2));

    }
    public static String reverseWords(String s) {
        String[] str=s.trim().split("\s+");
        String ans="";
        for(int i=str.length-1;i>0;i--){

            ans += str[i]+ " ";
        }
        return ans+str[0];
    }
}
