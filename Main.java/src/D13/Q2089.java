package D13;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q2089 {
    public static void main(String[] args) {
        int[] nums = {1,2,5,2,3};

        System.out.println(targetIndices(nums,5));
    }
    public static List<Integer> targetIndices(int[] nums, int target) {
        Arrays.sort(nums);
        List<Integer> ans=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if(nums[i]==target){
                ans.add(i);
            }
        }
        return ans;
    }
}
