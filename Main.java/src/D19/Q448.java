package D19;

import java.util.ArrayList;
import java.util.List;

public class Q448 {
    public static void main(String[] args) {
        int[] nums = {4,3,2,7,8,2,3,1};
        System.out.println(findDisappearedNumbers(nums));

    }
    public static List<Integer> findDisappearedNumbers(int[] nums) {
        int n=nums.length;

        for(int i:nums){
            int x=(i-1)%n;//3,2,1,6,7,1,2...
            nums[x]=nums[x]+n;//{4,3,2,15,8,2,3,1};{4,3,10,15,8,2,3,1};{4,11,10,15,8,2,3,1};{4,11,10,15,8,2,11,1}
            //;{12,11,10,15,8,2,11,9};{12,19,10,15,8,2,11,9};{12,19,18,15,8,2,11,9};{20,19,18,15,8,2,11,9};...
        }

        List<Integer> ans=new ArrayList<>();
        for(int i=0;i<n;i++){
            if(nums[i]<=n){
                ans.add(i+1);
            }
        }
        return ans;
    }
}
