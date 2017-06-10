package coursera.assignment;
import static org.junit.Assert.*;

import org.junit.Test;


public class PA010isChangeTest {
	
	@Test
	public void test() {
		assertEquals(2, PA010isChange.getChange(2));
		assertEquals(6, PA010isChange.getChange(28));
	}

	@Test
	public void test1() {
		long n = 15;
		long m = 3;
		long expected = 1;
//		assertEquals(expected, FibonacciHuge.getFibonacciHuge(n,m));
//		
//		n = 1;
//		m = 239;
//		expected = 1;
//		assertEquals(expected, FibonacciHuge.getFibonacciHuge(n,m));
//		
//		n = 239;
//		m = 1000;
//		expected = 161;
//		assertEquals(expected, FibonacciHuge.getFibonacciHuge(n,m));
//
//		n = 2816213588l;
//		m = 30524;
//		expected = 10249;
//		assertEquals(expected, FibonacciHuge.getFibonacciHuge(n,m));
//		
		n = 99999999999999999l;
		m = 100000;
		expected = 90626;
		assertEquals(expected, PA007isFibonacciHuge.getFibonacciHuge(n,m));
	}

}
