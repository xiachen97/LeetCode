package rev1;


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
    
public class Q876 {
    public static ListNode head;
    public static void main(String[] args) {
        ListNode lst1=new ListNode(1);
        ListNode lst2=new ListNode(2);
        ListNode lst3=new ListNode(3);
        ListNode lst4=new ListNode(4);
        ListNode lst5=new ListNode(5);
        ListNode lst6=new ListNode(6);

        lst1.next=lst2;
        lst2.next=lst3;
        lst3.next=lst4;
        lst4.next=lst5;
        lst5.next=lst6;
        head=lst1;
        

        middleNode(head);

    }
    public static ListNode middleNode(ListNode head) {


        ListNode cur=head;
        int size=0;
        while(cur!=null){
            cur=cur.next;
            size++;
        }
        cur=head;
        for(int i=0;i<size/2;i++){
            cur=cur.next;
        }
        return cur;

    }
}
