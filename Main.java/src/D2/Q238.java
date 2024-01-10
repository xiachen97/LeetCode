package D2;

public class Q238 {
    public static void main(String[] args){
        int[] nums={1,2,3,4};
        int[] ans=productExceptSelf(nums);
        for(int x:ans){
            System.out.println(x);
        }
        

    }
    public static int[] productExceptSelf(int[] nums) {

        //1. brute farce
        // int[] ans=new int[nums.length];
        
        // for(int j=0;j<nums.length;j++){
        //     int initial_res=1;
        //     for(int i=0;i<nums.length;i++){
        //         if(i == j) continue;
        //         initial_res=initial_res*nums[i];
        //     }
        //     ans[j]=initial_res;
            
        // }

        // return ans;


        //2. Dividing the product of array with the number
        int[] ans=new int[nums.length];
        int initial_res=1;
        int countZeroes = 0;
        for(int i=0;i<nums.length;i++){
            if (nums[i]!= 0) {
                initial_res *= nums[i];
            } 
            else {
                countZeroes++;
            }
        
        }

        for(int i=0;i<nums.length;i++){
            if (countZeroes == 0) {
                ans[i]=initial_res/nums[i];
            }else if(countZeroes==1&&nums[i]==0){
                ans[i]=initial_res;
            }
            else{
                ans[i]=0;
            }
        }
        return ans;

    }
}
