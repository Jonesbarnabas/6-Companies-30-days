package Flipkart;
import java.util.*;
  //Definition for singly-linked list.
class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
 
public class remove_zeros {
    public static ListNode removeZeroSumSublists(ListNode head) {
        if(head==null) return head;
        ListNode dum=new ListNode(0);
        dum.next=head;
        ListNode cur=head;
        int sum=0;
        while(cur!=null){
            if(cur.val+sum==0) 
                dum.next=cur.next;


            sum+=cur.val;
            cur=cur.next;
        }
        if(dum.next!=null){
            dum.next.next=removeZeroSumSublists(dum.next.next);
        }
        System.out.println(dum);
        return dum.next;
    }
    public static void main(String[] args) {
        
    }
}
