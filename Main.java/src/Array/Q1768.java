/*Note: 
1. use StringBuilder();
*/
package Array;
public class Q1768 {
    public static void main(String[] args){
        String w1 = "abc";
        String w2 = "pqr";
        System.out.println(mergeAlternately(w1, w2));//apbqcr

    }

    public static String mergeAlternately(String word1, String word2) {
        StringBuilder result=new StringBuilder();
        int i=0;
        while(i<word1.length()||i<word2.length()){

            if(i<word1.length()){
                result.append(word1.charAt(i));
            }
            if(i<word2.length()){
                result.append(word2.charAt(i));
            }
            
            i++;
        }
        return result.toString();
    }
}
