package D4;

public class Q1493 {
    public static void main(String[] args) {
        int[] nums = {1,1,0,1};
        System.out.println(longestSubarray(nums));
    }
    public static int longestSubarray(int[] nums) {
        int count_zero=0;

        int i=0;
        int j=0;
        int max_value=0;
        while(j<nums.length){
            if(nums[j]==0){
                count_zero++;
                while(count_zero>1){
                    if(nums[i]==0){
                        count_zero--;
                    }
                    i++;
                }
                
            }
            max_value=Math.max(max_value, j-i+1);
            j++;
        }


        return count_zero==0?nums.length-1:max_value-1;
    }
}
