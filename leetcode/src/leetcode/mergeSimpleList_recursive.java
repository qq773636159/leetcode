package leetcode;
import leetcode.ListNode;

public class mergeSimpleList_recursive {
	public ListNode merge(ListNode l1, ListNode l2) {
		if(l1 == null) return l2;
		if(l2 == null) return l1;
		
		ListNode head;
		if(l1.val < l2.val) {
			head = l1; 
			head.next = merge(l1.next, l2);
		} else {
			head = l2;
			head.next = merge(l1, l2.next);
		}
		
		return head;
	}
}
