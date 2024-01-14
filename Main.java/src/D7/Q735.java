package D7;

import java.util.Stack;

public class Q735 {
    public static void main(String[] args) {
        int[] asteroids1 = {-1,5,10,-5};
        int[] asteroids2 = {8,-8};
        int[] asteroids3 = {10,2,-5};

        int arr1[]=asteroidCollision(asteroids1);
        for(int c:arr1){
            System.out.println(c);//{-1,5,10}
        }
        System.out.println();
        int arr2[]=asteroidCollision(asteroids2);
        for(int c:arr2){
            System.out.println(c);//{}
        }
        System.out.println();       
        int arr3[]=asteroidCollision(asteroids3);
        for(int c:arr3){
            System.out.println(c);//{10}
        }
    }
    public static int[] asteroidCollision(int[] asteroids) {
        int n = asteroids.length;
        Stack<Integer> s = new Stack<>();
        for (int i = 0; i < n; i++) {
            if (asteroids[i] > 0 || s.isEmpty()) {
                s.push(asteroids[i]);
            } else {
                while (!s.isEmpty() && s.peek() > 0 && s.peek() < Math.abs(asteroids[i])) {
                    s.pop();
                }
                if (!s.isEmpty() && s.peek() == Math.abs(asteroids[i])) {
                    s.pop();
                } else {
                    if (s.isEmpty() || s.peek() < 0) {
                        s.push(asteroids[i]);
                    }
                }
            }
        }
        int[] res = new int[s.size()];
        for (int i = s.size() - 1; i >= 0; i--) {
            res[i] = s.pop();
        }
        return res;
    }
}
