package rev1;

import java.util.ArrayList;

class ListNode{
    int val;
    ListNode next;
    ListNode(){}
    ListNode(int val){this.val=val;}
    ListNode(int val,ListNode next){this.val=val;this.next=next;}

}
public class Q328 {
    public static ListNode head;
    
    public static void main(String[] args) {
        ListNode lst1=new ListNode(5);
        ListNode lst2=new ListNode(4);
        ListNode lst3=new ListNode(2);
        ListNode lst4=new ListNode(1);
        ListNode lst5=new ListNode(5);
        ListNode lst6=new ListNode(6);
        lst1.next=lst2;
        lst2.next=lst3;
        lst3.next=lst4;
        lst4.next=lst5;
        lst5.next=lst6;
        head=lst1;

        oddEvenList(head);
    }
    public static ListNode oddEvenList(ListNode head) {

        if (head == null || head.next == null) {
            return head;
        }

        ListNode odd = head;
        ListNode even = head.next;
        ListNode evenHead = even;

        while (even != null && even.next != null) {
            odd.next = even.next;
            odd = odd.next;
            even.next = odd.next;
            even = even.next;
        }

        odd.next = evenHead;

        return head;


    }
}