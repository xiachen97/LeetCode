package rev1;

import java.util.Arrays;
import java.util.HashMap;

public class Q2418 {
    public static void main(String[] args) {
        String[] names = {"Mary","John","Emma"};
        int[] heights = {180,165,170};
        sortPeople(names, heights);
    }
    public static String[] sortPeople(String[] names, int[] heights) {
        HashMap<Integer,String> map=new HashMap<>();
        for(int i=0;i<names.length;i++){
            map.put(heights[i],names[i]);
        }
        Arrays.sort(heights);
        String[] ans=new String[names.length];
        int index=0;
        for(int i=names.length-1;i>=0;i--){
            ans[index]=map.get(heights[i]);
            index++;
        }

        return ans;
    }
}
