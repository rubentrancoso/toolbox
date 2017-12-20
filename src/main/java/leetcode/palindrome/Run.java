package leetcode.palindrome;

public class Run {

	public static void main(String[] args) {
		ListNode list = Factory.build();
		list.print();
		System.out.println();
		System.out.println(isPalindrome(list));
	}

	   public static boolean isPalindrome(ListNode head) {
	        boolean result = false;
	        if(head==null) return true;
	        int size = getSize(head);
	        ListNode last = getLast(head);
	        ListNode current = head;
	        if(current !=null) {
	            int rightTailPos = computeRightTailsPos(size);
	            // get the right start element
	            ListNode rightStart = findByIndex(head, rightTailPos);
	            // invert the tail
	            invertList(rightStart);
	            result = testPalindrome(head,last);
	        }
	        return result;
	    }
	    
	    private static int computeRightTailsPos(int size) {
	        int half = size / 2;
	        boolean odd = (size%2==0)?false:true;
	        int rightTailPos; 
	        if(odd) {
	            // skip median
	            rightTailPos = half + 2;
	        } else {
	            rightTailPos = half + 1;
	        }   
	        return rightTailPos;
	    }
	    
	    private static ListNode findByIndex(ListNode head, int n) {
	        ListNode current = head;
	        int pos = 1;
	        while(current!=null && pos < n) {
	            current = current.next;   
	            pos++;
	        }
	        return current;
	    }
	    
	    private static int getSize(ListNode head) {
	        int size = 0;
	        ListNode current = head;
	        while(current != null) {
	            size++;
	            current = current.next;            
	        }
	        return size;
	    }

	    private static ListNode getLast(ListNode head) {
	        ListNode last = null;
	        ListNode current = head;
	        while(current != null) {
	            last = current;
	            current = current.next;            
	        }
	        return last;
	    }
	    
	    /*
	     * run both lists in pair to check equality
	     * and fail on fist difference
	     */
	    private static boolean testPalindrome(ListNode left, ListNode right) {
	        ListNode l, r;
	        l = left;
	        r = right;
	        if(r==null) return false;
	        while(r!=null) {
	            if(r.val != l.val) {
	                return false;
	            }
	            l = l.next;
	            r = r.next;
	        }
	        return true;    
	    }
	    
	    private static ListNode invertList(ListNode head) {
	        ListNode previous = null;
	        ListNode current = head;
	        ListNode next = null;
	        while(current!=null) {
	            next = current.next;
	            current.next = previous;
	            previous = current;
	            current = next;
	        }
	        return previous;
	    }
	    
	    private static void printList(ListNode head) {
	        System.out.print(":");
	        ListNode current = head;
	        while(current!=null) {
	            System.out.print(current.val);
	            current = current.next;
	        }
	        System.out.println();
	    }
}
