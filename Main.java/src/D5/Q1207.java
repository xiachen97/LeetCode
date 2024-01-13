package D5;

import java.util.HashMap;
import java.util.HashSet;

public class Q1207 {
    public static void main(String[] args) {
        int[] arr={1,2,1,1,3,2};
        System.out.println(uniqueOccurrences(arr));
    }
    public static boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            if(map.containsKey(arr[i])){
                map.put(arr[i],map.get(arr[i])+1);
            }
            else{
                map.put(arr[i],1);
            }
           
        }
        //System.out.println(map);

        //check if the set each num are unique
        HashSet<Integer> set=new HashSet<>(map.values());
        return  set.size()==map.size();
    }
}
