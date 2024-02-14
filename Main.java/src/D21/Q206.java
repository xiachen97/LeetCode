package D21;

class ListNode{
    int val;
    ListNode next;
    ListNode(){}
    ListNode(int val){this.val=val;}
}

public class Q206 {
    public static void main(String[] args) {
        ListNode list1=new ListNode(1);
        list1.next=new ListNode(2);
        list1.next.next=new ListNode(3);
        list1.next.next.next=new ListNode(4);
        list1.next.next.next.next=new ListNode(5);
        reverseList(list1);
    }
    public static ListNode reverseList(ListNode head) {
        ListNode preNode =null;
        ListNode curr=head;
        while(curr!=null){
            ListNode temp=curr.next;
            curr.next=preNode;
            preNode=curr;
            curr=temp;

        }
        return preNode;

    }
        
}
