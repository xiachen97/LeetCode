package D7;

import java.util.ArrayDeque;
import java.util.Queue;
class Q933 {
    Queue<Integer> q;
    public static void main(String[] args) {
        Q933 q933 = new Q933();

        // Test ping with different timestamps
        System.out.println(q933.ping(1));  // Output: 1
        System.out.println(q933.ping(100));  // Output: 2
        System.out.println(q933.ping(3001));  // Output: 3
        System.out.println(q933.ping(3002));  // Output: 3 (one element gets removed)
    }
    public Q933() {
        q=new ArrayDeque<>();

    }
    
    public int ping(int t) {
        q.add(t);
        while(q.peek()<t-3000){
            q.remove();//q.poll();
        }

        return q.size();
    }
}
