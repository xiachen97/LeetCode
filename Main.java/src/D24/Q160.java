package D24;
class ListNode{
    ListNode next;
    int val;
    ListNode(int val){this.val=val;}
    ListNode(){}
}
public class Q160 {
    public static void main(String[] args) {
        ListNode list1=new ListNode(4);
        list1.next=new ListNode(1);
        list1.next.next=new ListNode(8);
        list1.next.next.next=new ListNode(4);
        list1.next.next.next.next=new ListNode(5);

        ListNode list2=new ListNode(5);
        list2.next=new ListNode(6);
        list2.next.next=new ListNode(1);

        list2.next.next.next=list1.next.next;
        
        ListNode ans=getIntersectionNode(list1,list2);
        print(ans);
    }
    public static ListNode getIntersectionNode(ListNode head1,ListNode head2) {
        if(head1==null||head2==null){
            return null;
        }
        ListNode cur1=head1;
        ListNode cur2=head2;
        
        while(cur1!=cur2){
            cur1=cur1==null? head2:cur1.next;
            cur2=cur2==null? head1:cur2.next;
        }

        return cur1;
    }
    public static void print(ListNode head){

        while(head!=null){
            System.out.println(head.val);
            head=head.next;
        }

    }

}