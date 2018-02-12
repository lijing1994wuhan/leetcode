package leetcode;

public class solution {
	
	    public ListNode FindKthToTail(ListNode head,int k) {
	        for(int i=0;i<k;i++){
	            head=head.next;
	        }
	        return head;

	    }
	
}