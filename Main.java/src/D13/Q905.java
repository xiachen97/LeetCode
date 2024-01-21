package D13;

public class Q905 {
    public static void main(String[] args) {
        int[] nums = {3,1,2,4};
        for(int i:sortArrayByParity(nums)){
            System.out.println(i);
        }
        
    }
    public static int[] sortArrayByParity(int[] nums) {
        int n=nums.length;
        int j=n-1;
        int i=0;
        int[] arr=new int[n];
        for(int num:nums){
            if(num%2==0) arr[i++] = num;
            else arr[j--] = num;
        }
        return arr;
    }
}
