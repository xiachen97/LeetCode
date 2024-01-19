package D12;
import java.util.ArrayList;

class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}
    
public class Q2130 {
    public static ListNode head;
    public static void main(String[] args) {
        ListNode lst1=new ListNode(5);
        ListNode lst2=new ListNode(4);
        ListNode lst3=new ListNode(2);
        ListNode lst4=new ListNode(1);


        lst1.next=lst2;
        lst2.next=lst3;
        lst3.next=lst4;

        head=lst1;
        

        System.out.println(pairSum(head));
    }
    public static int pairSum(ListNode head) {
    
        ArrayList<Integer> arr=new ArrayList<>();
        while(head!=null){
            arr.add(head.val);
            head=head.next;
        }

        int max=Integer.MIN_VALUE;
        int n=arr.size();
        for(int i=0;i<n/2;i++){
            if(max < arr.get(i)+arr.get(n-1-i)){
                max=arr.get(i)+arr.get(n-1-i);
            }
        }
        return max;
    }
} 