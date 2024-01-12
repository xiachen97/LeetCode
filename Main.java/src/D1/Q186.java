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
package D1;
public class Q186 {
    // public static void main(String[] args){
    //     char[] s = {'t','h','e',' ', 's','k','y', ' ','i','s',' ', 'b','l','u','e'};
    //     reverseAll(s,0,s.length-1);
    //     for(char c:s){
    //         System.out.print(c);
    //     }
    //     reverseEachWord(s);
    //     for(char c:s){
    //         System.out.print(c);
    //     }
        


    // }
    // public static void reverseAll(char[] s,int begin,int end) {

    //     while(begin<end){
    //         char temp=s[begin];
    //         s[begin]=s[end];
    //         s[end]=temp;
    //         begin++;
    //         end--;
    //     }
    // }

    // public static void reverseEachWord(char[] str) {
    //     int i=0;
    //     int j=0;
    //     int len=str.length;
    //     while(i<len&&j<len){    
    //         while(j<len&&str[j]!=' '){
    //             j++;
    //         }
    //         reverseAll(str,i,j-1);
    //         i=j+1;
    //         j++;
    //     }

    // }

    public static void main(String args[]) {
      
      char[] c={'t','h','e',' ','s','k','y',' ','i','s',' ','b','l','u','e'};
      int i=0;
      int j=c.length-1;
        
      reverseAll(c,i,j);
      for(char x:c){
           System.out.print(x+" ");
      }
      System.out.println();
      reverseEachWord(c);
      for(char x:c){
          System.out.print(x+" ");
      }

      
    }
    public static void reverseAll(char[] c,int i,int j){
        //use two pointer to reverseAll
        
        while(i<j){
            char temp=c[i];
            c[i]=c[j];
            c[j]=temp;
            i++;
            j--;
        }
    }
    
    public static void reverseEachWord(char[] c){
        //Get each ' ' and seperate from here, then use reverse all function
        int j=0;
        for(int i=0;i<c.length;i++){
            if(c[i]==' '){
                reverseAll(c,j,i-1);
                j=i+1;
            }
            
        }
        reverseAll(c,j,c.length-1);
        
    }


    
}
