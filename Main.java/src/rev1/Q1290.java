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

public class Q1290 {
    public static ListNode head;
    public static void main(String[] args) {
        ListNode lst1=new ListNode(1);
        ListNode lst2=new ListNode(0);
        ListNode lst3=new ListNode(0);
        ListNode lst4=new ListNode(1);
        ListNode lst5=new ListNode(0);
        ListNode lst6=new ListNode(1);

        lst1.next=lst2;
        lst2.next=lst3;
        lst3.next=lst4;
        lst4.next=lst5;
        lst5.next=lst6;
        head=lst1;
        System.out.println(getDecimalValue(head));

        

    }
    public static int getDecimalValue(ListNode head) {

        int ans=0;
        while(head!=null){
            ans=ans*2;
            ans=ans+head.val;
            head=head.next;
        }
        return ans;
    }
}
