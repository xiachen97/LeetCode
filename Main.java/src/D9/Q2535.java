package D9;

public class Q2535 {
    public static void main(String[] args) {
        int[] nums={1,15,6,3};
        System.out.println(differenceOfSum(nums));
    }
    public static int differenceOfSum(int[] nums) {
        
        int sum=0;
        for(int n:nums){
            sum+=n;
        }

        int digit_sum=0;
        for(int n:nums){
            while(n!=0){
                digit_sum+=n%10;
                n/=10;
            }
        }



        return sum-digit_sum;
    }
}
