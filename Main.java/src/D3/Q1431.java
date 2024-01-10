package D3;

import java.util.ArrayList;
import java.util.List;

public class Q1431 {
    public static void main(String[] args){
        int[] candies = {2,3,5,1,3};
        int extraCandies = 3;
        System.out.println(kidsWithCandies(candies, extraCandies));
    }
    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> ans= new ArrayList<>();
        int max=0;
        for(int i:candies){
            max=Math.max(i, max);
        }
        for(int x:candies){
            if(x+extraCandies>=max){
                ans.add(true);
            }
            else{
                ans.add(false);
            }
        }

        return ans;
    }
}
