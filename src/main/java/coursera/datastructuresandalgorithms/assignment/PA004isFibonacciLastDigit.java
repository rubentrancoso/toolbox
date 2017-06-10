package coursera.datastructuresandalgorithms.assignment;

import java.util.*;

public class PA004isFibonacciLastDigit {

	// private static int getFibonacciLastDigitNaive(int n) {
	// if (n <= 1)
	// return n;
	//
	// int previous = 0;
	// int current = 1;
	//
	// for (int i = 0; i < n - 1; ++i) {
	// int tmp_previous = previous;
	// previous = current;
	// current = tmp_previous + current;
	// }
	//
	// return current % 10;
	// }

	private static long calc_fib(int n) {
		if (n <= 1)
			return n;
		long result = 0;
		long nm2 = 0;
		long nm1 = 1;
		for (int i = 2; i <= n; i++) {
			result = nm1 + nm2;
			nm2 = nm1;
			nm1 = result;
		}
		return result;
	}

	private static int calc_lastdigit_fib(int n) {
		if (n <= 1)
			return n;
		int result = 0;
		int nm2 = 0;
		int nm1 = 1;
		for (int i = 2; i <= n; i++) {
			result = (nm1 + nm2) % 10;
			nm2 = nm1;
			nm1 = result;
		}
		return result;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		scanner.close();
		// long f = calc_fib(n);
		int c = calc_lastdigit_fib(n);
		// System.out.printf("%d %d\n",f,c);
		System.out.printf("%d\n", c);
	}
}
