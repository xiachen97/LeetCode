package D3;

import java.util.HashSet;

public class Q1456 {
    public static void main(String[] args) {
        String s = "abciiidef";
        int k = 3;
        System.out.println(maxVowels(s, k));
    }
    public static int maxVowels(String s, int k) {
        //1.slide window
        // int max_count=0;
        // int count=0;
        // for(int i=0;i<k;i++){
        //     if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u'){
        //         count++;
        //     }
        // }
        // max_count=count;
        // for(int i=k;i<s.length();i++){
        //     if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u'){
        //         count++;
        //     }
        //     if(s.charAt(i-k)=='a'||s.charAt(i-k)=='e'||s.charAt(i-k)=='i'||s.charAt(i-k)=='o'||s.charAt(i-k)=='u'){
        //             count--;
        //     }
        //     max_count=Math.max(max_count, count);
        // }
        // return max_count;


        //2.HashSet&&slide window
        HashSet<Character> set=new HashSet<>();
        set.add('a');
        set.add('e');
        set.add('i');
        set.add('o');
        set.add('u');
        
        int count=0;
        for(int i=0;i<k;i++){
            if(set.contains(s.charAt(i))){
                count++;
            }
        }

        int max_count=count;
        for(int i=k;i<s.length();i++){
            if(set.contains(s.charAt(i))){
                count++;
            }
            if(set.contains(s.charAt(i-k))){
                count--;
            }
            max_count=Math.max(max_count, count);
        }
        return max_count;

    }
}
