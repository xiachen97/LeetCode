package rev1;

public class Q70 {
    public static void main(String[] args) {
        int n=5;
        System.out.println(fib(n));
    }
    public static int fib(int n){
        if(n==1){return 1;}
        if(n==2){return 2;}
        // return fib(n-1)+fib(n-2);

        int ans=0;
        int pre=2;
        int prepre=1;
        for(int i=3;i<=n;i++){
            ans=pre+prepre;
            prepre=pre;
            pre=ans;
        }
        return ans;

    
    }
}
