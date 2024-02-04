package rev1;

import java.util.HashMap;

public class Q1 {
    public static void main(String[] args) {
        int[] nums={3,2,4};
        System.out.println(twoSum(nums,6));
    }
    public static int[] twoSum(int[] nums, int target) {

        int[] ans=new int[2];
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int rest=target-nums[i];
            Integer restIndex=map.get(rest);
            if(restIndex==null){
                map.put(nums[i],i);
            }
            else{
                ans[0]=i;
                ans[1]=restIndex;
                break;
            }
        }

        return ans;
    }
}
