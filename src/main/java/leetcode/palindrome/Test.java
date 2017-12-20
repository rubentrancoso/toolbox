package leetcode.palindrome;

public class Test {

	private static int MAXSIZE = 10;
	
	public static void main(String[] args) {
		for(int i=0;i<100;i++) {
			boolean palindrome = (Math.random() > 0.5) ? true : false;
			int size = (int) (Math.random() * MAXSIZE) + 1;
			printIt(Factory.randomString(size, palindrome));
			System.out.print(" ");
			System.out.print(palindrome);
			System.out.println();
		}
	}
	
	private static void printIt(int[] values) {
		for (int i = 0; i < values.length; i++) {
			System.out.print(values[i]);
		}
	}
}
