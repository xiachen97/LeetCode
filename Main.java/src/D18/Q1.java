package D18;

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
            map.put(nums[i], i);
        }
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(target-nums[i])&&map.get(target-nums[i])!=i){
                ans[0]=i;
                ans[1]=map.get(target-nums[i]);
                break;
            }
        }
        return ans;

        // int[] ans=new int[2];
        // HashMap<Integer,Integer> map=new HashMap<>();
        // for(int i=0;i<nums.length;i++){
        //     int rest=target-nums[i];
        //     Integer restIndex=map.get(rest);
        //     if(restIndex==null){
        //         map.put(nums[i], i);
        //     }
        //     else{
        //         ans[0]=i;
        //         ans[1]=restIndex;
        //         break;
        //     }
        // }
        // return ans;


        //1. brute farce: n^2
        // int[] ans=new int[2];

        // for(int i=0;i<nums.length;i++){
        //     for(int j=i+1;j<nums.length;j++){
        //         if(nums[i]+nums[j]==target){
        //             ans[0]=i;
        //             ans[1]=j;
        //         }
        //     }
        // }
        // return ans;
    }
}
