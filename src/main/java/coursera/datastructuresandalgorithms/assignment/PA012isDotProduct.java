package coursera.datastructuresandalgorithms.assignment;

import java.util.Arrays;
import java.util.Scanner;

public class PA012isDotProduct {
	public static Long maxDotProduct(Long[] a, Long[] b) {
		// write your code here
		// a = profit per click
		// b = average click per day
		int n = a.length;
		Long result = new Long(0);
		Arrays.sort(a);
		Arrays.sort(b);
		for (int i = n - 1; i > -1; i--) {
			result += a[i] * b[i];
		}
		return result;

	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		Long[] a = new Long[n];
		for (int i = 0; i < n; i++) {
			a[i] = scanner.nextLong();
		}
		Long[] b = new Long[n];
		for (int i = 0; i < n; i++) {
			b[i] = scanner.nextLong();
		}
		System.out.println(maxDotProduct(a, b));
	}
}
