package D22;

class ListNode{
    ListNode next;
    int val;
    ListNode(int val){this.val=val;}
}
public class Q141 {
    public static void main(String[] args) {
        ListNode list=new ListNode(1);
        list.next=new ListNode(1);
        list.next.next=new ListNode(2);
        list.next.next.next=new ListNode(3);
        list.next.next.next.next=list;
        System.out.println(hasCycle(list));//true
    }
    public static boolean hasCycle(ListNode head) {
        if(head==null){
            return false;
        }
        ListNode faster=head;
        ListNode slower=head;

        while(faster.next!=null&&faster.next.next!=null){
            slower=slower.next;
            faster=faster.next.next;
            if(faster==slower){
                return true;
            }

        }
        return false;
        
    }
}