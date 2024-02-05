package D20;
class ListNode{
    int val;
    ListNode next;
    ListNode(){}
    ListNode(int val){this.val=val;}
}
public class Q21 {
    public static void main(String[] args) {
        ListNode list1=new ListNode(1);
        list1.next=new ListNode(2);
        list1.next.next=new ListNode(4);

        ListNode list2=new ListNode(1);
        list2.next=new ListNode(3);
        list2.next.next=new ListNode(4);
        

        
        mergeTwoLists(list1,list2);
    }
    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        //2.recusive O(m+n)
        if(list1==null){return list2;}
        if(list2==null){return list1;}
        if(list1.val<=list2.val){
            list1.next=mergeTwoLists(list1.next,list2);
            return list1;
        }
        list2.next=mergeTwoLists(list1, list2.next);
        return list2;

        //1.Two point + loop O(m+n)
        // if(list1==null){return list2;}
        // if(list2==null){return list1;}

        // ListNode res=new ListNode(0);
        // ListNode temp=res;
        // while(list1!=null&&list2!=null){
        //     if(list1.val<=list2.val){
        //         temp.next=list1;
        //         list1=list1.next;
        //     }
        //     else{
        //         temp.next=list2;
        //         list2=list2.next;
        //     }
        //     temp=temp.next;
        // }
        // if(list1!=null){
        //     temp.next=list1;
            
        // }
        // if(list2!=null){
        //     temp.next=list2;
        // }


        // return res.next;
    }
}
