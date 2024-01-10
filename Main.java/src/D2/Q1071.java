//check if str1 + str2 == str2 + str1
//equal => find the longest common substring.
//o.w. return "".
package D2;
public class Q1071 {
    public static void main(String[] args){
        String s1 = "ABCABC";
        String s2 = "ABC";
        System.out.println(gcdOfStrings(s1, s2));

    }
    public static String gcdOfStrings(String str1, String str2) {
        if(!(str1 + str2).equals(str2 + str1)){
            return "";
        }
    
        return str1.substring(0, GreatestCommonDivisor(str1.length(),str2.length()));
    }

    public static int GreatestCommonDivisor(int a,int b){
        if(b==0){
            return a;
        }
        else{
            return GreatestCommonDivisor(b,a%b);
        }
    }
}
