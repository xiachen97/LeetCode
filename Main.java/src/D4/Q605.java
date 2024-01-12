package D4;

public class Q605 {
    public static void main(String[] args) {
        int[] f={1,0,0,0,0,1};
        int n=2;
        System.out.println(canPlaceFlowers(f, n));//false

        int[] f1={1,0,0,0,0,0,1};
        System.out.println(canPlaceFlowers(f1, n));//true

    }
    public static boolean canPlaceFlowers(int[] flowerbed, int n) {
        for(int i=0;i<flowerbed.length;i=i+2){
            if(flowerbed[i]==0){
                if(i==flowerbed.length-1||flowerbed[i]==flowerbed[i+1]){
                    n--;
                }
                else{
                    i++;
                }
            }
            

        }

        return n<=0;
    }
}
