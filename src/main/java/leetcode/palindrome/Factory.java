package leetcode.palindrome;

public class Factory {
	
	private static int MAXSIZE = 10;
	
	public static ListNode build() {
		boolean palindrome = (Math.random() > 0.5) ? true : false;
		int size = (int) (Math.random() * MAXSIZE) + 1;
		int[] data = randomString(size, palindrome);
		ListNode root =  new ListNode(data[0]);
		ListNode last = root;
		if(data.length>1)
			for (int i = 1; i < data.length; i++) {
				ListNode next = new ListNode(data[i]);
				last.next = next;
				last = next;
			}
		return root;
	}
	
	public static int[] randomString(int size, boolean palindrome) {
		int[] string = new int[size];
		if(palindrome) {
			boolean odd = (size%2==0) ? false: true;
			int half = size/2;
			if(odd) {
				half += 1;
			}
			for (int i = 0; i < half; i++) {
				double random = Math.random();
				int number = (int) (random * 10);
				string[i] = number;
			}
			for(int i = string.length-1;i>=half;i--) {
				string[i] = string[string.length-i-1];
			}
		} else {
			for (int i = 0; i < string.length; i++) {
				double random = Math.random();
				int number = (int) (random * 10);
				string[i] = number;
			}
		}
		return string;
	}

}
