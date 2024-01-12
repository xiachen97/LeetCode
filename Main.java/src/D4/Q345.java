package D4;

import java.util.HashSet;

public class Q345 {
    public static void main(String[] args) {
        String s1 = "hello";
        String s2 = "leetcode";
        System.out.println(reverseVowels(s1));//holle
        System.out.println(reverseVowels(s2));//leotcede

    }
    public static String reverseVowels(String s) {
        HashSet<Character> set=new HashSet<>();
        set.add('a');
        set.add('e');
        set.add('i');
        set.add('o');
        set.add('u');
        set.add('A');
        set.add('E');
        set.add('I');
        set.add('O');
        set.add('U');

        char[] arr=s.toCharArray();//{'h','e','l','l','o'}
        int i=0;
        int j=s.length()-1;
        while(i<j){
            if(!set.contains(arr[i])&&!set.contains(arr[j])){
                i++;
                j--;
            }
            else if(set.contains(arr[i])&&!set.contains(arr[j])){
                j--;

            }
            else if(!set.contains(arr[i])&&set.contains(arr[j])){
                i++;
            }
            else{
                
                reverseEach(arr,i,j);
                i++;
                j--;
            }
        }
        return String.valueOf(arr);
    }
    public static char[] reverseEach(char[] array,int i,int j) {
        char temp=array[i];
        array[i]=array[j];
        array[j]=temp;
        return array;
    }

}
