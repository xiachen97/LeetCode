//step 1: create map1(string,int)=>(rowString,occurrence times)
//create map2(string,int)=>(colString,occurrence times)

//step 2: compare each key and cacu count
package D6;

import java.util.HashMap;

public class Q2352 {
    public static void main(String[] args) {
        int[][] grid={
            {3,1,2,2},
            {1,4,4,5},
            {2,4,2,2},
            {2,4,2,2}
        };
        System.out.println(equalPairs(grid));
    }
    public static int equalPairs(int[][] grid) {

        HashMap<String,Integer> map1=new HashMap<>();
        HashMap<String,Integer> map2=new HashMap<>();
        
        for(int i=0;i<grid.length;i++){
            StringBuilder row=new StringBuilder();
            StringBuilder col=new StringBuilder();
            for(int j=0;j<grid.length;j++){
                row.append(grid[i][j]).append(' ');//"321",...  //.append(' ') will avoid such as [[11,1],[1,11]]
                col.append(grid[j][i]).append(' ');//"312",...  //.append(' ') will avoid such as [[11,1],[1,11]]
            }
            map1.put(row.toString(), map1.getOrDefault(row.toString(),0)+1);
            map2.put(col.toString(), map2.getOrDefault(col.toString(),0)+1);
        }

        int count=0;

        for(String s:map1.keySet()){
            if(map2.containsKey(s)){
                count=count+map1.get(s)*map2.get(s); // map1.get(s)*map2.get(s) is to avoid in row (or col), there are have muilt same string, need duplicate cacu
            }
        }
        return count;
        
    }
}
