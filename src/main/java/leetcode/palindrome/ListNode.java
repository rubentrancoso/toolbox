package leetcode.palindrome;

public class ListNode {
	int val;
	ListNode next;
	
	ListNode(int val) {
		this.val = val;
	}
	
	void print() {
		System.out.print(val);
		if(next!=null)
			next.print();
	}
}
