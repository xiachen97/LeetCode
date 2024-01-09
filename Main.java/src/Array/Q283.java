/*Note: 
1. track nums[j]!=0
2. i is used to track the position of non-zero elements.
*/

package Array;

public class Q283 {
    public static void main(String[] args){
        int[] nums={0,1 , 2, 3, 0};

        moveZeroes(nums);
        for(int k:nums){
            System.out.print(k);//1 2 3 0 0
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
}
