package D17;

import java.util.HashMap;

public class Q70 {
    public static void main(String[] args) {
        int n=6;
        System.out.println(climbStairs(n));
    }
    
    public static HashMap<Integer,Integer> memory=new HashMap<>();
    public static int climbStairs(int n) {
        //way 1
        //time :2^n?, no memorization, time exceeded
        // if(n<=2&&n>0){
        //     return n;
        // }
        // return climbStairs(n-1)+climbStairs(n-2);


        //way2: recusive
        //time:n, have memorization
        // if(n<=2&&n>0){
        //     return n;
        // }
    
        // if(memory.get(n)==null){
        //     int res=climbStairs(n-1)+climbStairs(n-2);
        //     memory.put(n,res);
        //     return res;
        // }
        // else{
        //     return memory.get(n);
        // }


        ////way3: iterate
        //time:n, have memorization,from bottom to top
        if(n<=2&&n>0){
            return n;
        }
        int pre=2;
        int prepre=1;
        int res=0;
        for(int x=3;x<=n;x++){
            res=pre+prepre;
            prepre=pre;
            pre=res;
        }
        return res;
    }
}
        
    