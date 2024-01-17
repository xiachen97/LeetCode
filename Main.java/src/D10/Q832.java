package D10;

public class Q832 {
    public static void main(String[] args) {
        int[][] matrix={
            {1,1,0},
            {1,0,1},
            {0,0,0}
        };
        int[][] ans=flipAndInvertImage(matrix);
       
        for(int i=0;i<ans.length;i++){
            for(int j=0;j<ans.length;j++){
                System.out.println(ans[i][j]);
            }
        }
        
    }
    public static int[][] flipAndInvertImage(int[][] image) {
        int n;
        int[][] ans=new int[image.length][image.length];
        for(int i=0;i<ans.length;i++){
            n=ans.length-1;
            for(int j=0;j<ans.length;j++){
                ans[i][j]=image[i][n];
                n--;
                if(ans[i][j]==1){
                    ans[i][j]=0;
                }
                else{
                    ans[i][j]=1;
                }
            }
        }


        return ans;
    }
}
