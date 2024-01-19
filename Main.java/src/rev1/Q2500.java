package rev1;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Q2500 {
    public static void main(String[] args) {
        int[][] grid = {
            {1,2,4},
            {3,3,1}};
        System.out.println(deleteGreatestValue(grid));
    }
    public static int deleteGreatestValue(int[][] grid) {
        for(int[] i:grid){
           Arrays.sort(i);
        }
        int ans=0;
        int col_len=grid[0].length-1;
        while(col_len>=0){
            int max=Integer.MIN_VALUE;
            for(int[] i:grid){
                if(i[col_len]>max){
                    max=i[col_len];
                }
            }
            col_len--;
            ans+=max;
        }
        
        return ans;
    }
}
