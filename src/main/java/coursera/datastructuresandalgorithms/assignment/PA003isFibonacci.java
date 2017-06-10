package coursera.datastructuresandalgorithms.assignment;

import java.util.Scanner;

public class PA003isFibonacci {

	private static long calc_fib(int n) {
		if (n <= 1)
			return n;
		long nm2 = 0;
		long nm1 = 1;
		for (int i = 2; i <= n; i++) {
			long store = nm2;
			nm2 = nm1;
			nm1 = nm2 + store;
		}
		return nm1;
	}

	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		in.close();
		System.out.println(calc_fib(n));
	}
}
