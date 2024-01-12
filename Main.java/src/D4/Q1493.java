package D4;
//Q1493 simliar => Q1004, this is flip k times(let 0->1) when nums[i]=0 to get the longestSubarray about 1's
//Q1493 is delete one 0 to get the longestSubarray about 1's == flip 1 times, then -1
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
