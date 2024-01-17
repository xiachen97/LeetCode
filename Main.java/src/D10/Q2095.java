package D10;


class ListNode{
    int val;
    ListNode next;
    ListNode(int val){this.val=val;}
    ListNode(int val,ListNode next){ this.val=val; this.next=next;}
}
public class Q2095 {
    
    public static void main(String[] args) {
        int[] arr = {1,3,4,7,1,2,6};
        head=arrToList(arr);
        System.out.println(getSize());//7

        deleteMiddle(head);
        System.out.println("after deleting middle element:");
        print();

    }

    public static ListNode head;
    public static ListNode deleteMiddle(ListNode h) {
        int deleteIndex=getSize()/2;
        if (deleteIndex == 0) {
            head = head.next;
        } else {
            //IMPORTANT
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

    public static ListNode arrToList(int[] arr){
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
