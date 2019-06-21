package leetcode;
import leetcode.ListNode;
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */

//This is a wrong version. Not even working. Will need to return to see where is wrong. 
public class mergeSimpleList {
	public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
		ListNode node = null;
		return mergeTwoLists(node, l1, l2.next); 
	}
	
	public static ListNode mergeTwoLists(ListNode node, ListNode l1, ListNode l2) {
		//base case
		if(l1 == null && l2 == null) return null;
		else if(l1 == null || l1.val > l2.val) {//l1 val > l2 val
			node = new ListNode(l2.val);
			node.next = mergeTwoLists(node.next, l1, l2.next);
			System.out.print(node.val);
			return node;
		}
		else {
			node = new ListNode(l1.val);
			node.next = mergeTwoLists(node.next, l1.next, l2);
			return node;
		}
	}
	
	public static void main(String[] args) {
		ListNode a = new ListNode(1);
//		a.next = new ListNode(2);
//		a.next.next = new ListNode(4);
		
		ListNode b = new ListNode(1);
//		b.next = new ListNode(3);
//		b.next.next = new ListNode(4);
		
		ListNode node = mergeTwoLists(a, b);
		System.out.print(node);
	}
}
