package coursera.datastructuresandalgorithms.assignment;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import coursera.datastructuresandalgorithms.assignment.PA007isFibonacciHuge;

public class PA007isFibonacciHugeTest {

	@Test
	public void test() {
		// ssertEquals(1, FibonacciHuge.getFibonacciHugeNaive(15, 3));
		// s assertEquals(610, FibonacciHuge.calc_fib(15));
		assertEquals(3, PA007isFibonacciHuge.calc_pisano_length(15, 2));
		assertEquals(8, PA007isFibonacciHuge.calc_pisano_length(15, 3));
	}

	@Test
	public void test1() {
		long n = 15;
		long m = 3;
		long expected = 1;
		// assertEquals(expected, FibonacciHuge.getFibonacciHuge(n,m));
		//
		// n = 1;
		// m = 239;
		// expected = 1;
		// assertEquals(expected, FibonacciHuge.getFibonacciHuge(n,m));
		//
		// n = 239;
		// m = 1000;
		// expected = 161;
		// assertEquals(expected, FibonacciHuge.getFibonacciHuge(n,m));
		//
		// n = 2816213588l;
		// m = 30524;
		// expected = 10249;
		// assertEquals(expected, FibonacciHuge.getFibonacciHuge(n,m));
		//
		n = 99999999999999999l;
		m = 100000;
		expected = 90626;
		assertEquals(expected, PA007isFibonacciHuge.getFibonacciHuge(n, m));
	}

}
