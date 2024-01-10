package D2;

public class Q11 {
    public static void main(String[] args){
        int[] height={1,8,6,2,5,4,8,3,7};
        
        System.out.println(maxArea(height));  
    }
    public static int maxArea(int[] height) {
        int max_area=0;
        int i=0;
        int j=height.length-1;
        while (i<j) {
            int w=j-i;
            int h=Math.min(height[i], height[j]);
            int area=w*h;
            max_area=Math.max(max_area, area);
            if(height[i]<height[j]){
                i++;
            }
            else if((height[i]>height[j])){
                j--;
            }
            else{
                i++;
                j--;
            }
        }
        return max_area;
    }
}
