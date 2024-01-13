package D6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;

public class Q1657 {
    public static void main(String[] args) {
        String word1 = "abc";
        String  word2 = "bac";
        System.out.println(closeStrings(word1, word2));
    }
    public static boolean closeStrings(String word1, String word2) {
        //1.
        // if(word1.length()!=word2.length()){return false;}

        // char[] w1=word1.toCharArray();
        // char[] w2=word2.toCharArray();

        // HashMap<Character,Integer> map1=new HashMap<>();
        // HashMap<Character,Integer> map2=new HashMap<>();
        // for(char w:w1){
        //     if(map1.containsKey(w)){
        //         map1.put(w,map1.get(w)+1);
        //     }else{
        //         map1.put(w,1);
        //     }
        // }
        // for(char w:w2){
        //     if(map2.containsKey(w)){
        //         map2.put(w,map2.get(w)+1);
        //     }else{
        //         map2.put(w,1);
        //     }
        // }
        // for(char key1 : map1.keySet()){
        //     if(!map2.containsKey(key1)) return false;
        // }
        // ArrayList<Integer> a=new ArrayList(map1.values());
        // ArrayList<Integer> b=new ArrayList(map2.values());
        // Collections.sort(a);
        // Collections.sort(b);
        
        // return a.equals(b);



        //2.
        if(word1.length() != word2.length()) 
            return false;

        int arr1[] = new int[26], arr2[] = new int[26];
        HashSet<Integer> set = new HashSet<>();

        ...

        Arrays.sort(arr1);
        Arrays.sort(arr2);
        return Arrays.equals(arr1, arr2);
    }
}
