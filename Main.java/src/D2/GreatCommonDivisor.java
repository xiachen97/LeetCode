package D2;

public class GreatCommonDivisor {
    public static void main(String[] args){
        int num1=8;
        int num2=12;
        System.out.println(gcd(num1,num2));//4
    }
    //1. Recursive form of Euclidean algorithm (euclidean division)
    public static int gcd(int a,int b){
        if(b==0){
            return a;
        }
        return gcd(b,a%b);
    }

    //2.
    // public static int gcd(int a, int b) {
    //     while (b != 0) {
    //         int temp = b;
    //         b = a % b;
    //         a = temp;
    //     }
    //     return a;
    // }

}
