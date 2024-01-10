package D3;

import java.util.Arrays;

public class Q1679 {
    public static void main(String[] args) {
        int[] nums = {3,1,3,4,3};
        int  k = 6;
        System.out.println(maxOperations(nums, k));

    }
    public static int maxOperations(int[] nums, int k) {
        int ans=0;
        Arrays.sort(nums);//time:nlogn
        int i=0;
        int j=nums.length-1;
        
        while(i<j){
            if(nums[i]+nums[j]==k){
                ans++;
                i++;
                j--;
            }
            else if(nums[i]+nums[j]>k){
                j--;
            }
            else{
                i++;
            }
        }
        return ans;
    }
}
