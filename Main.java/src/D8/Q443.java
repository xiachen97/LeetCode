package D8;

public class Q443 {
    public static void main(String[] args) {
        char[] chars = {'a','a','b','b','c','c','c'};
        char[] chars1 = {'a'};
        char[] chars2 = {'a','b','b','b','b','b','b','b','b','b','b','b','b'};
        System.out.println(compress(chars));//a2b2c3 => len=6
        System.out.println(compress(chars1));//a => len=1
        System.out.println(compress(chars2));//ab12 => len=4
    }
    public static int compress(char[] chars) {
        int index=0;//result index
        int count=0;//Count the number of occurrences of each character
        for(int i=0;i<chars.length;i++){
            count++;
            if(i+1==chars.length||chars[i]!=chars[i+1]){
                chars[index]=chars[i];
                index++;
                if(count!=1){
                    for(char c:Integer.toString(count).toCharArray()){
                        chars[index]=c;
                        index++;
                    }
                }
                count=0;
            }
        }
        return index;
    }
}
