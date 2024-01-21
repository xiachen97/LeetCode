package rev1;

import java.util.ArrayList;

class ListNode{
    int val;
    ListNode next;
    ListNode(){}
    ListNode(int val){this.val=val;}
    ListNode(int val,ListNode next){this.val=val;this.next=next;}

}
public class Q2130 {
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

        System.out.println(pairSum(head));
    }
    public static int pairSum(ListNode head) {

        ArrayList<Integer> list=new ArrayList<>();
        int size=0;
        while(head!=null){
            list.add(head.val);
            head=head.next;   
            size++;
        }
        int max=0;
        for(int i=0;i<size/2;i++){
            max=Math.max(list.get(i)+list.get(size-1-i),max);
        }
        return max;
    }
}
