package D9;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Q2610 {
    public static void main(String[] args) {
        int[] nums = {1,3,4,1,2,3,1};
        System.out.println(findMatrix(nums));

    }
    public static List<List<Integer>> findMatrix(int[] nums) {
        
        List<List<Integer>> ans=new ArrayList<>();

        int size=0;
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int c:nums){
            map.put(c,map.getOrDefault(c,0)+1);
            size=Math.max(size,map.get(c));//ans_size
        }


         // Initialize the matrix with the maximum frequency as the number of rows
         for (int i = 0; i < size; i++) {
            ans.add(new ArrayList<>());
        }

        // Populate the matrix based on the frequency of elements
        for (int key : map.keySet()) {
            int frequency = map.get(key);//3  {1=3, 2=1, 3=2, 4=1}
            for (int i = 0; i < frequency; i++) {
                ans.get(i).add(key);//[[1],[1],[1]]=>[[1,2],[1],[1]]=>[[1,2,3],[1,3],[1]]=>[[1,2,3,4],[1,3],[1]]
            }
        }

        return ans;
    }
}
