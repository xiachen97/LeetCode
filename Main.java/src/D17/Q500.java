package D17;

import java.util.HashMap;

public class Q500 {
    public static HashMap<Integer,Integer> map=new HashMap<>();//for memorization
    public static void main(String[] args) {
        int n=4;
        System.out.println(fib(n));
    }
    public static int fib(int n){
    if(n==0){return 0;}
        if(n==1){return 1;}

        if(map.get(n)==null){
            int ans=fib(n-2)+fib(n-1);
            map.put(n,ans);
            return ans;
        }
        else{
            return map.get(n);
        }
    }
}
