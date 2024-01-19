package D11;
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
        //1.
        // ListNode cur=head;
        // int size=0;
        // while(cur!=null){
        //     size++;
        //     cur=cur.next;
        // }

        // int sum=0;
        // int k=size-1;
        // for(int i=0;i<size;i++){
        //     sum=sum+(int)Math.pow(2, k)*head.val;
        //     head=head.next;
        //     k--;
        // }


        // return sum;



        //2.
        int sum = 0;
        while(head != null){
            sum = sum * 2; //ans=ans<<1 (in bit manipulation)
            sum = sum + head.val;
            head = head.next;
            System.out.println(sum);
        }

        return sum;



    }

}
