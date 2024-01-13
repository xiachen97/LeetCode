package D6;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Q2215 {
    public static void main(String[] args) {
        int[] nums1 = {1,2,3};
        int[] nums2 = {2,4,6};
        System.out.println(findDifference(nums1, nums2));
    }
    public static List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        

        HashSet<Integer> set1=new HashSet<>();
        HashSet<Integer> set2=new HashSet<>();

        for(int i:nums1){
            set1.add(i);
        }
        for(int i:nums2){
            set2.add(i);
        }
        List<List<Integer>> ans=new ArrayList<>();
        List<Integer> arr1=new ArrayList<>(set1);
        List<Integer> arr2=new ArrayList<>(set2);
        arr1.removeAll(set2);
        arr2.removeAll(set1);
        ans.add(arr1);
        ans.add(arr2);

        return ans;

    }
}
