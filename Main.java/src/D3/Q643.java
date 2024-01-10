package D3;

public class Q643 {
    public static void main(String[] args) {
        int[] nums={0,1,1,3,3};
        System.out.println(findMaxAverage(nums,4));
    }
    public static double findMaxAverage(int[] nums, int k) {
        int sum=0;
        for(int i=0;i<k;i++){
            sum+=nums[i];
        }
        int max_sum=sum;

        for(int i=k;i<nums.length;i++){    
            max_sum=Math.max(max_sum, sum);
            sum=sum-nums[i-k]+nums[i];
        }

        return (double)max_sum/k;
    }
}
