package D5;

public class Q560 {
    public static void main(String[] args) {
        int[] nums = {1,2,1,2,1};
        int k = 3;
        System.out.println(subarraySum(nums, k));//4; 12,21,12,21
    }
    public static int subarraySum(int[] nums, int k) {
        //1. Brute force cracking   
        int count=0;
        for(int i=0;i<nums.length;i++){
            int sum=0;
            for(int j=i;j<nums.length;j++){
                sum+=nums[j];
               if(sum==k){
                count++;
               }
            }
           
        }
        return count;
        //2.prefix sum&&HashMap
        
    }
}
