package D6;

public class twoDem {
    public static void main(String[] args) {
        int[][] grid={
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };
        printGrid(grid);
    }
    public static void printGrid(int[][] grid) {
        grid[1][1] = 10;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[i].length;j++){
                System.out.println(grid[i][j]+" ");// 1 2 3 4 10 6 7 8 9
            }
        }
    }
    
}
