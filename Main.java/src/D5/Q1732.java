package D5;
public class Q1732 {
    public static void main(String[] args) {
        int[] gain={-5,1,5,0,-7};
        System.out.println(largestAltitude(gain));
    }
    public static int largestAltitude(int[] gain) {
        //1.
        // int max_value=0;
        // int[] arr=new int[gain.length+1];
        // arr[0]=0;
        // for(int i=1;i<arr.length;i++){
        //     arr[i]=gain[i-1]+arr[i-1];
        //     max_value=Math.max(max_value,arr[i]);
        // }

        // return max_value;


        //2.
        int sum=0;
        int max_value=0;
        for(int i:gain){
            sum+=i;
            max_value=Math.max(max_value, sum);    
        }
        return max_value;
    }

    
}
