/*Note: 
Input:  
["t","h","e"," ","s","k","y"," ","i","s"," ","b","l","u","e"]

Output: 
["b","l","u","e"," ","i","s"," ","s","k","y"," ","t","h","e"]

A word is defined as a sequence of non-space characters.
The input string does not contain leading or trailing spaces.
The words are always separated by a single space.
Follow up: Could you do itin-placewithout allocating extra space?
step1: Two Pointers reverse all：eulb si yks eht
step2: reverse each word：blue is sky the
*/
package Array;
public class Q186 {
    public static void main(String[] args){
        char[] s = {'t','h','e',' ', 's','k','y', ' ','i','s',' ', 'b','l','u','e'};
        reverseAll(s,0,s.length-1);
        for(char c:s){
            System.out.print(c);
        }
        reverseEachWord(s);
        for(char c:s){
            System.out.print(c);
        }
        


    }
    public static void reverseAll(char[] s,int begin,int end) {

        while(begin<end){
            char temp=s[begin];
            s[begin]=s[end];
            s[end]=temp;
            begin++;
            end--;
        }
    }

    public static void reverseEachWord(char[] str) {
        int i=0;
        int j=0;
        int len=str.length;
        while(i<len&&j<len){    
            while(j<len&&str[j]!=' '){
                j++;
            }
            reverseAll(str,i,j-1);
            i=j+1;
            j++;
        }

    }
}
