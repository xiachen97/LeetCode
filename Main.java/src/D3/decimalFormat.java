package D3;


public class decimalFormat {
    public static void main(String[] args) {
        //double ans=1.0;
        //System.out.printf("%.5f%n", 1.0);//1.00000//String

        double ans = 1.0;
        String str = String.format("%.5f", ans);
        ans = Double.parseDouble(str);
    
        System.out.println(ans);//1.0//Double
    }
}
