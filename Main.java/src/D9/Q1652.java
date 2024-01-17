package D9;



public class Q1652 {
    public static void main(String[] args) {
        int[] code = {1,2,3,4};
        int k=3;

        for(int c:decrypt(code, k)){
            System.out.println(c);
        }
    }
    public static int[] decrypt(int[] code, int k) {

        int[] ans = new int[code.length];

        if (k > 0) {
            for (int i = 0; i < code.length; i++) {
                int sum = 0;
                for (int j = 1; j <= k; j++) {
                    sum += code[(i + j) % code.length];
                }
                ans[i] = sum;
            }
        } else if (k < 0) {
            for (int i = 0; i < code.length; i++) {
                int sum = 0;
                for (int j = -1; j >= k; j--) {
                    sum += code[((i + j) % code.length + code.length) % code.length];
                }
                ans[i] = sum;
            }
        }

        return ans;
    }
}
