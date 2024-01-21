package rev1;



class ListNode{
    int val;
    ListNode next;
    ListNode(int val){this.val=val;}
    ListNode(int val,ListNode next){ this.val=val; this.next=next;}
}
public class Q2095 {
    
    public static void main(String[] args) {
        ListNode lst1=new ListNode(1);
        ListNode lst2=new ListNode(4);
        ListNode lst3=new ListNode(5);
        ListNode lst4=new ListNode(1);
        ListNode lst5=new ListNode(6);
        ListNode lst6=new ListNode(1);

        lst1.next=lst2;
        lst2.next=lst3;
        lst3.next=lst4;
        lst4.next=lst5;
        lst5.next=lst6;
        head=lst1;
        deleteMiddle(head);

    }

    public static ListNode head;
    public static ListNode deleteMiddle(ListNode h) {
        int deleteIndex=getSize()/2;
        if (deleteIndex == 0) {
            head = head.next;
        } else {
            ListNode prev = null;
            ListNode cur = head;
            for (int i = 0; i < deleteIndex; i++) {
                prev = cur;
                cur = cur.next;
            }
            prev.next = cur.next;
        }
        return head;
    }
    
    public static int getSize(){
        ListNode cur=head;
        int size=0;
        while(cur!=null){
            size++;
            cur=cur.next;
        }
        return size;
    }
}
