package D11;

import java.util.Arrays;
import java.util.HashMap;

public class Q2418 {
    public static void main(String[] args) {
        String[] names = {"Mary","John","Emma"};
        int[] heights = {180,165,170};
        String[] ans=sortPeople(names, heights);
        for(String a:ans){
            System.out.println(a);
        }
    }
    public static String[] sortPeople(String[] names, int[] heights) {
        String[] ans=new String[names.length];

        HashMap<Integer,String> map=new HashMap<>();
        int i=0;
        for(String n:names){
            map.put(heights[i],n);
            i++;
        }
        Arrays.sort(heights);

        int index=0;
        for(int k=heights.length-1;k>=0;k--){
            ans[index]=map.get(heights[k]);
            index++;
            
        }


        return ans;
    }
}
