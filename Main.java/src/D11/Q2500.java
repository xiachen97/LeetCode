package D11;

import java.util.Arrays;

public class Q2500 {
    public static void main(String[] args) {
        int[][] grid = {
            {1,2,4},
            {3,3,1}
        };
        System.out.println(deleteGreatestValue(grid));
    }
    public static int deleteGreatestValue(int[][] grid) {
        
        for(int[] i:grid){
            Arrays.sort(i);//{4,2,1}
                           //{3,3,1}
        }

        int n = grid[0].length - 1;
        int sum = 0;

        while(n>=0){
            int max=Integer.MIN_VALUE;
            for(int[] i:grid){
                int num=i[n];
                if(num>max){
                    max=num;
                }
            }
            n--;
            sum+=max;
        }

        return sum;
    }
}
