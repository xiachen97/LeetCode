/*Note: 
1. track nums[j]!=0
2. i is used to track the position of non-zero elements.
*/

package D1;

public class Q283 {
    public static void main(String[] args){
        int[] nums={0,1 , 2, 3, 0};

        moveZeroes(nums);
        for(int k:nums){
            System.out.print(k);//1 2 3 0 0
        }

        int[] n={0,1,0,3,2};
        moveZeroForward(n);
        for(int x:n){
            System.out.print(x);//0,0,1,3,2
        }

    }
    public static void moveZeroes(int[] nums) {
        int i=0;
        for(int j=0;j<nums.length;j++){
            if(nums[j]!=0){
                nums[i]=nums[j];
                i++;
            }
        }
        for(int k=i;k<nums.length;k++){
            nums[k]=0;
        }
    }
    public static void moveZeroForward(int[] nums){
       int i=0;
       for(int j=1;j<nums.length;j++){
           if(nums[i]!=0&&nums[j]==0){
               //1. swap nums[i] and nums[j]  //2. or directly let nums[i]=nums[j]; nums[j]=0;
               int temp=nums[i];
               nums[i]=nums[j];
               nums[j]=temp;
           }
           i++;
       }

        
    }
}
