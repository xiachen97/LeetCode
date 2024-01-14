package D7;

public class Q334 {
    public static void main(String[] args) {
        int[] nums1 = {1,2,3,4,5};
        int[] nums2 = {5,4,3,2,1};
        int[] nums3 = {2,1,5,0,4,6};
        int[] nums4 = {1,1,1,1,1,1};
        System.out.println(increasingTriplet(nums1));//t
        System.out.println(increasingTriplet(nums2));//f
        System.out.println(increasingTriplet(nums3));//t
        System.out.println(increasingTriplet(nums4));//f
    }
    public static boolean increasingTriplet(int[] nums) {
        if(nums.length<=2){
            return false;
        }

        int a=Integer.MAX_VALUE;
        int b=Integer.MAX_VALUE;
        for(int i:nums){
            if(i<=a){
                a=i;//a=2, 1, 0
            }
            else if(i<=b){
                b=i;//b=5, 4
            }
            else{
                return true;//6
            }
            
        }
        return false;
        
    }
}
