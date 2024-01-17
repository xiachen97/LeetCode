package D10;


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


public class linklist {
    public static ListNode head;
    public static void main(String[] args) {
        int[] arr = {1,3,4,7,1,2,6};
        head=ArrayToList(arr);
        print();

    }
    public static ListNode ArrayToList(int[] arr) {
        ListNode tempHead=new ListNode(-1);
        ListNode cur=tempHead;
        for(int i:arr){
            ListNode newNode=new ListNode(i);
            cur.next=newNode;
            cur=cur.next;
        }
        return tempHead.next;
    }

    public static void print(){
        ListNode cur=head;
        while(cur!=null){
            System.out.print(cur.val+" ");
            cur=cur.next;
        }
    }


}
