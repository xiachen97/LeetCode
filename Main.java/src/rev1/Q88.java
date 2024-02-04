package rev1;

public class Q88 {
    public static void main(String[] args) {
        int[] nums1 = {2,2,3,0,0,0};
        int m = 3;
        int[] nums2 = {1,5,6};
        int n = 3;
        merge(nums1, m, nums2, n);
        for(int x:nums1){
            System.out.println(x);
        }
    }
    public static void merge(int[] nums1, int m, int[] nums2, int n) {

        int i=m-1;
        int j=n-1;
        int k=m+n-1;
        while(i>=0&&j>=0){
            if(nums1[i]<=nums2[j]){
                nums1[k--]=nums2[j--];
            }
            else{
                nums1[k--]=nums1[i--];
            }
        }
        while(j>=0){
            nums1[k--]=nums2[j--];
        }

    }
}
