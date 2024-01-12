package D4;

public class Q1004 {
    public static void main(String[] args) {
        int[] nums = {0,0,1,1,0,0,1,1,1,0,1,1,0,0,0,1,1,1,1};
        int k = 3;
        System.out.println(longestOnes(nums, k));
    }
    public static int longestOnes(int[] nums, int k) {
        //two pointer&&slide window
        //Note:time comp:O(n) only pointer i and j move in nums.length; space comp:O(1)
        int max_value=0;

        int i=0;
        int j=0;
        int count_zero=0;
        while(j<nums.length){
            if(nums[j]==0){
                count_zero++;
                while(count_zero>k){
                    if(nums[i]==0){
                        count_zero--;        
                    }
                    i++; 
                    
                }
            }
            max_value=Math.max(max_value, j-i+1);
            j++;
        }


        return max_value;
    }
}
