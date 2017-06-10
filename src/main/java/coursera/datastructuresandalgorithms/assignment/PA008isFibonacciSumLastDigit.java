package coursera.datastructuresandalgorithms.assignment;

import java.util.Scanner;

public class PA008isFibonacciSumLastDigit {

	// public static long getFibonacciHugeNaive(long n, long m) {
	// if (n <= 1)
	// return n;
	//
	// long previous = 0;
	// long current = 1;
	// for (long i = 2; i <= n; i++) {
	// long tmp_previous = previous;
	// previous = current;
	// current = tmp_previous + current;
	// }
	// return current%m;
	// }

	public static long getFibonacciHuge(long n, long m) {
		if (n <= 1)
			return n;
		long l = calc_pisano_length(n, m);
		long np = 0;
		if (l < 0)
			np = n;
		else
			np = n % l;
		long ld = calc_fib_lastdigit_sum_huge(np);
		return ld;
	}

	// public static long calc_fib(long n) {
	// if (n<=1)
	// return n;
	//
	// long previous = 0;
	// long current = 1;
	// for (long i = 2; i<=n; i++) {
	// long tmp_previous = previous;
	// previous = current;
	// current = tmp_previous + current;
	// }
	// return current;
	// }

	// public static BigInteger calc_fib_huge(long n) {
	// BigInteger bn = BigInteger.valueOf(n);
	// if (bn.compareTo(BigInteger.valueOf(1)) <= 0)
	// return bn;
	//
	// BigInteger previous = BigInteger.valueOf(0);
	// BigInteger current = BigInteger.valueOf(1);
	// for (BigInteger i = BigInteger.valueOf(2); i.compareTo(bn) <= 0; i =
	// i.add(BigInteger.valueOf(1))) {
	// BigInteger tmp_previous = previous;
	// previous = current;
	// current = tmp_previous.add(current);
	// }
	// return current;
	// }

	public static long calc_fib_lastdigit_sum_huge(long n) {
		if (n <= 1)
			return n;

		long previous = 0;
		long current = 1;
		long sum = 1;
		for (long i = 2; i <= n; i++) {
			long tmp_previous = previous;
			previous = current;
			current = (tmp_previous + current) % 10;
			sum += current;
		}
		return sum % 10;
	}

	// public static long calc_pisano_length(long n, long m) {
	// long f0 = 0;
	// long f1 = 1;
	// boolean found = false;
	// long i = 2;
	// while(!found) {
	// f0 = f1;
	// f1 = calc_fib_huge(i).remainder(BigInteger.valueOf(m)).longValue();
	// i++;
	// if(i>n)
	// return -1;
	// if(f0 == 0 & f1 == 1) {
	// return i-2;
	// }
	// }
	// return 1;
	// }

	public static long calc_pisano_length(long n, long m) {
		long a = 0;
		long b = 1;
		long c = a + b;
		for (int i = 0; i < m * m; i++) {
			c = (a + b) % m;
			a = b;
			b = c;
			if (a == 0 & b == 1)
				return i + 1;
		}
		return 1;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		long n = scanner.nextLong();
		System.out.println(getFibonacciHuge(n, 10));
	}
}
