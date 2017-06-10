package coursera.datastructuresandalgorithms.assignment;

import java.util.Scanner;

public class PA009isFibonacciPartialSum {

	private static long previous = 0;
	private static long current = 1;
	private static long sum = 0;
	private static long pisano = 0;

	public static long getFibonacciPartialSum(long from, long to) {
		if (to <= 1)
			return to;

		previous = 0;
		current = 1;
		sum = 0;

		long fib_from = calc_fib_lastdigit_huge(from);
		sum = fib_from;

		return calc_fib_lastdigit_sum_huge(from, to);
	}

	// // Obtem um fibonacci muito grande a partir da redução
	// // a sequencia de pisano no modulo 10
	// public static BigInteger calc_fibonacci_huge(long n) {
	// long m = 10;
	// if (n <= 1)
	// return BigInteger.valueOf(n);
	// pisano = calc_pisano_length(n,m);
	// long np = 0;
	// if(pisano<0)
	// np =n;
	// else
	// np = n%pisano;
	// BigInteger fib = calc_fib_biginteger(np);
	// return fib;
	// }

	// Obtem o ultimo digito de um fibonacci muito grande a partir da redução
	// a sequencia de pisano no modulo 10
	public static long calc_fib_lastdigit_huge(long n) {
		long m = 10;
		if (n <= 1)
			return n;
		pisano = calc_pisano_length(n, m);
		long np = 0;
		if (pisano < 0)
			np = n;
		else
			np = n % pisano;
		long fib = calc_fib_last_digit(np);
		return fib;
	}

	public static long calc_fib_lastdigit_sum_huge(long from, long to) {
		//
		// for (long i = 0; i < n; i++) {
		// long tmp_previous = previous;
		// previous = current;
		// current = tmp_previous + current;
		// sum = (sum + current)%10;
		// }
		long m = 10;
		long n = to - from;
		long np = 0;
		pisano = calc_pisano_length(n, m);
		if (pisano < 0)
			np = n;
		else
			np = n % pisano;
		long fib = calc_fib_lastdigit_sum(np);
		return fib;

	}

	public static long calc_fib_lastdigit_sum(long n) {

		for (long i = 0; i < n; i++) {
			long tmp_previous = previous;
			previous = current;
			current = tmp_previous + current;
			sum = (sum + current) % 10;
		}
		return sum;
	}

	// public static BigInteger calc_fib_biginteger(long n) {
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

	public static long calc_fib_last_digit(long n) {
		if (n <= 1)
			return n;

		previous = 0;
		current = 1;
		for (long i = 2; i <= n; i++) {
			long tmp_previous = previous;
			previous = current;
			current = (tmp_previous + current) % 10;
		}
		return current;
	}

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
		long from = scanner.nextLong();
		long to = scanner.nextLong();
		System.out.println(getFibonacciPartialSum(from, to));
	}
}
