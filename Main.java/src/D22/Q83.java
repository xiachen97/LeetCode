package D22;
class ListNode{
    ListNode next;
    int val;
    ListNode(int val){this.val=val;}
}
public class Q83 {
    public static void main(String[] args) {
        ListNode list=new ListNode(1);
        list.next=new ListNode(1);
        list.next.next=new ListNode(2);
        list.next.next.next=new ListNode(3);
        list.next.next.next.next=new ListNode(3);
        print(list);
        deleteDuplicates(list);
        System.out.println("-----------delete dup---------");
        print(list);

    }

    public static ListNode deleteDuplicates(ListNode head) {
        if(head==null){
            return head;
        }
        ListNode cur=head;
        while(cur.next!=null){
            if(cur.val==cur.next.val){
                cur.next=cur.next.next;
            }
            else{
                cur=cur.next;
            }
        }
        return head;
    }
    public static void print(ListNode head){
        while(head!=null){
            System.out.println(head.val);
            head=head.next;
        }
    }
}
