package D5;

public class Q724 {
    public static void main(String[] args) {
        int[] nums={1,7,3,6,5,6};
        System.out.println(pivotIndex(nums) );
    }
    public static int pivotIndex(int[] nums) {
        int leftSum=0;
        int rightSum=0;
        for(int i:nums){
            rightSum+=i;
        }
        for(int i=0;i<nums.length;i++){
            rightSum-=nums[i];
            
            if(leftSum==rightSum){
                return i;
            }
            leftSum+=nums[i];
        }
        return -1;
    }
}
