package D10;

class ListNode{
    int val;
    ListNode next;
    ListNode(){}
    ListNode(int val){this.val=val;}
    ListNode(int val,ListNode next){this.val=val; this.next=next;}
}
public class Q328 {
    public static ListNode head;
    public static void main(String[] args) {
        ListNode lst1=new ListNode(1);
        ListNode lst2=new ListNode(2);
        ListNode lst3=new ListNode(3);
        ListNode lst4=new ListNode(4);
        ListNode lst5=new ListNode(5);

        lst1.next=lst2;
        lst2.next=lst3;
        lst3.next=lst4;
        lst4.next=lst5;
        head=lst1;
        print();//test : head=1 2 3 4 5
        System.out.println("After oddEvenList runing...");
        head=oddEvenList(head);
        print();

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

    public static void print(){
        ListNode cur=head;
        while(cur!=null){

            System.out.println(cur.val);
            cur=cur.next;
        }
    }
}
