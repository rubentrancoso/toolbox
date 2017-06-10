package coursera.datastructuresandalgorithms.assignment;

import java.util.*;

public class PA005isGCD {

	// private static int gcd_naive(int a, int b) {
	// int current_gcd = 1;
	// for(int d = 2; d <= a && d <= b; ++d) {
	// if (a % d == 0 && b % d == 0) {
	// if (d > current_gcd) {
	// current_gcd = d;
	// }
	// }
	// }
	// return current_gcd;
	// }

	private static long gcd_naive(long a, long b) {
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
		long a = scanner.nextInt();
		long b = scanner.nextInt();
		scanner.close();

		System.out.println(gcd_naive(a, b));
	}
}
