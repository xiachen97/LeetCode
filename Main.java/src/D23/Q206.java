package D23;
class ListNode{
    ListNode next;
    int val;
    ListNode(int val){this.val=val;}
    ListNode(){}
}
public class Q206 {
    public static void main(String[] args) {
        ListNode list=new ListNode(1);
        list.next=new ListNode(2);
        list.next.next=new ListNode(3);
        list.next.next.next=new ListNode(4);
        list.next.next.next.next=new ListNode(5);
        
        print(reverseList(list));
    }
    public static ListNode reverseList(ListNode head) {
        ListNode cur=head;
        ListNode preNode=null;
        
        while(cur!=null){
            ListNode newNode=cur.next;
            cur.next=preNode;
            preNode=cur;
            cur=newNode;
        }

        return preNode;
    }
    public static void print(ListNode list){
        while(list!=null){
            System.out.println(list.val);
            list=list.next;

        }
    }

}
