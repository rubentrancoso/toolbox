package coursera.datastructuresandalgorithms.assignment;

import java.util.*;
import java.io.*;

public class PA002isMaxPairwiseProduct {
	static long getMaxPairwiseProduct(long[] numbers) {
		long first = 0;
		long second = 0;
		int n = numbers.length;
		for (int i = 0; i < n; ++i) {
			long number = numbers[i];
			if (number > first) {
				second = first;
				first = number;
			} else {
				if (number > second) {
					second = number;
				}
			}
		}
		return first * second;
	}

	public static void main(String[] args) {
		FastScanner scanner = new FastScanner(System.in);
		int n = scanner.nextInt();
		long[] numbers = new long[n];
		for (int i = 0; i < n; i++) {
			numbers[i] = scanner.nextInt();
		}
		System.out.println(getMaxPairwiseProduct(numbers));
	}

	static class FastScanner {
		BufferedReader br;
		StringTokenizer st;

		FastScanner(InputStream stream) {
			try {
				br = new BufferedReader(new InputStreamReader(stream));
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

		String next() {
			while (st == null || !st.hasMoreTokens()) {
				try {
					st = new StringTokenizer(br.readLine());
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			return st.nextToken();
		}

		int nextInt() {
			return Integer.parseInt(next());
		}
	}

}