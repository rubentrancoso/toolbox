package coursera.datastructuresandalgorithms.assignment;

import java.util.*;

public class PA006isLCM {

	// private static long lcm_naive(int a, int b) {
	// for (long l = 1; l <= (long) a * b; ++l)
	// if (l % a == 0 && l % b == 0)
	// return l;
	//
	// return (long) a * b;
	// }

	private static long lcm_naive(int a, int b) {
		return a / gcd(a, b) * b;
	}

	private static long gcd(long a, long b) {
		long current_gcd = 1;
		long max = a;
		long min = b;
		if (a < b) {
			max = b;
			min = a;
		}
		while (true) {
			long reminder = max % min;
			if (reminder == 0) {
				current_gcd = min;
				break;
			}
			max = min;
			min = reminder;
		}
		return current_gcd;
	}

	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		scanner.close();

		System.out.println(lcm_naive(a, b));
	}
}
